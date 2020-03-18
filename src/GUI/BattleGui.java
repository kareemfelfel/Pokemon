package GUI;
import players.Player;
import players.User;

import javax.swing.*;
import java.awt.*;

public class BattleGui extends JFrame
{
    ImageIcon UserPokemonPic, CompPokemonPic;
    private Player user;
    private Player computer;
    public BattleGui(Player PUser, Player PComputer)
    {
        // Initialize the 2 main players on the screen
        user = PUser;
        computer = PComputer;
        //Show Gui
        CreateGui();
        CenterWindow();
        CreateTopComponents();
        this.setVisible(true);

    }

    private void CreateTopComponents()
    {
        //------------------------UPDATE USER POKEMON IMAGE-----------------------------------
        UserPokemonPic = new ImageIcon(user.getCurrentPokemon().getPictureLocation());
        Image image = UserPokemonPic.getImage(); // transform it
        Image newimg = image.getScaledInstance(100, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        UserPokemonPic = new ImageIcon(newimg);
        JLabel UserPokImage = new JLabel(UserPokemonPic);
        UserPokImage.setBounds(20,5,100,120);
        //------------------------------------------------------------------------------------

        //------------------------UPDATE COMPUTER POKEMON IMAGE-------------------------------
        CompPokemonPic = new ImageIcon(computer.getCurrentPokemon().getPictureLocation());
        Image image2 = CompPokemonPic.getImage(); // transform it
        Image newimg2 = image2.getScaledInstance(100, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        CompPokemonPic = new ImageIcon(newimg2);
        JLabel CompPokImage = new JLabel(CompPokemonPic);
        CompPokImage.setBounds(450,5,100,120);
        //-------------------------------------------------------------------------------------

        //-------------------------------ADD BOTH IMAGES TO SCREEN-----------------------------
        this.add(UserPokImage);
        this.add(CompPokImage);


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
