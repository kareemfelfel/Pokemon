package GUI;
import players.Player;
import players.User;

import javax.swing.*;
import java.awt.*;

public class BattleGui extends JFrame
{
    JLabel UserPokImage, CompPokImage;
    private Player user;
    private Player computer;
    private JLabel UserHealthLbl, CompHealthLbl;
    public BattleGui(Player PUser, Player PComputer)
    {
        // Initialize the 2 main players on the screen
        user = PUser;
        computer = PComputer;
        //Show Gui
        CreateGui();
        CenterWindow();
        AddImages();
        //UpdateImages();
        //UpdateHealth();
        AddHealthToGUI();
        this.setVisible(true);

    }

    private void UpdateImages()
    {
        //------------------------UPDATE USER POKEMON IMAGE-----------------------------------
        ImageIcon UserPokemonPic = new ImageIcon(user.getCurrentPokemon().getPictureLocation());
        Image image = UserPokemonPic.getImage(); // transform it
        Image newimg = image.getScaledInstance(100, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        UserPokemonPic = new ImageIcon(newimg);
        UserPokImage.setIcon(UserPokemonPic);
        UserPokImage.setBounds(60,50,100,120);
        //------------------------------------------------------------------------------------

        //------------------------UPDATE COMPUTER POKEMON IMAGE-------------------------------
        ImageIcon CompPokemonPic = new ImageIcon(computer.getCurrentPokemon().getPictureLocation());
        Image image2 = CompPokemonPic.getImage(); // transform it
        Image newimg2 = image2.getScaledInstance(100, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        CompPokemonPic = new ImageIcon(newimg2);
        CompPokImage.setIcon(CompPokemonPic);
        CompPokImage.setBounds(420,50,100,120);
        //-------------------------------------------------------------------------------------
    }

    private void AddHealthToGUI()
    {

        //---------------------ADDING THE USER HEALTH---------------
        UserHealthLbl = new JLabel("Health: "+ user.getCurrentPokemon().getHitPoints());
        UserHealthLbl.setForeground(Color.white);
        UserHealthLbl.setBackground(new Color(61, 65, 71));
        UserHealthLbl.setFont(new Font("Sans Serif", Font.BOLD, 16));
        //------------------------------------------------------------

        //--------------------UPDATING THE COMPUTER HEALTH-------------
        CompHealthLbl = new JLabel("Health: "+ computer.getCurrentPokemon().getHitPoints());
        CompHealthLbl.setForeground(Color.white);
        CompHealthLbl.setBackground(new Color(61, 65, 71));
        CompHealthLbl.setFont(new Font("Sans Serif", Font.BOLD, 16));
        //-------------------------------------------------------------

        //---------------------SETTING THE BOUNDS----------------------
        UserHealthLbl.setBounds(60,20,100,20);
        CompHealthLbl.setBounds(420,20,100,20);
        //--------------------ADD LABELS TO GUI------------------------
        this.add(CompHealthLbl);
        this.add(UserHealthLbl);
        //-------------------------------------------------------------
    }

    private void UpdateHealth()
    {
        //---------------------UPDATING THE USER HEALTH---------------
        UserHealthLbl.setText("Health: "+ user.getCurrentPokemon().getHitPoints());
        //------------------------------------------------------------

        //--------------------UPDATING THE COMPUTER HEALTH-------------
        CompHealthLbl.setText("Health: "+ computer.getCurrentPokemon().getHitPoints());

        //-------------------------------------------------------------


    }

    private void AddImages()
    {
        //------------------------UPDATE USER POKEMON IMAGE-----------------------------------
        ImageIcon UserPokemonPic = new ImageIcon(user.getCurrentPokemon().getPictureLocation());
        Image image = UserPokemonPic.getImage(); // transform it
        Image newimg = image.getScaledInstance(100, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        UserPokemonPic = new ImageIcon(newimg);
        UserPokImage = new JLabel(UserPokemonPic);
        UserPokImage.setBounds(60,50,100,120);
        //------------------------------------------------------------------------------------

        //------------------------UPDATE COMPUTER POKEMON IMAGE-------------------------------
        ImageIcon CompPokemonPic = new ImageIcon(computer.getCurrentPokemon().getPictureLocation());
        Image image2 = CompPokemonPic.getImage(); // transform it
        Image newimg2 = image2.getScaledInstance(100, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        CompPokemonPic = new ImageIcon(newimg2);
        CompPokImage = new JLabel(CompPokemonPic);
        CompPokImage.setBounds(420,50,100,120);
        //-------------------------------------------------------------------------------------

        //-------------------------------ADD BOTH IMAGES TO SCREEN-----------------------------
        this.add(UserPokImage);
        this.add(CompPokImage);
        //-------------------------------------------------------------------------------------


    }

    private void CenterWindow()
    {
        //Open in middle of screen
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - this.getWidth()) / 3;
        int iCoordY = (objDimension.height - this.getHeight()) / 8;
        this.setLocation(iCoordX, iCoordY);
    }

    private void CreateGui()
    {
        //-------------------Look and Feel-------------------
        this.setUndecorated(false);

        //-----------------SETTING ELEMENTS OF FRAME---------

        // Setting layout as null of JFrame.
        this.setLayout(null);
        //Set Size of window
        this.setSize(600,700);
        //Changing the background color to grey
        this.getContentPane().setBackground(new Color(61, 65, 71));
        //do not allow user to resize
        this.setResizable(false);
        //set title name
        this.setTitle("Battle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //-----------------------------------------------------

        //------------------Title and Icon----------------------------
        ImageIcon icon = new ImageIcon("Pics/Ball.png");
        this.setIconImage(icon.getImage());
        //--------------------------------------------------------------


    }
}
