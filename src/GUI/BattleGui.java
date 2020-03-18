package GUI;
import players.Player;
import players.User;
import pokemons.Attacks;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BattleGui extends JFrame
{
    private JLabel UserPokImage, CompPokImage;
    private JButton Attack1, Attack2, Attack3, Attack4;
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
        AddHealthToGUI();
        AddAttacks();
        this.setVisible(true);

    }

    private void AddAttacks()
    {

        //-----------GETTING THE ATTACKS AND ASSIGNING THEIR NAMES TO BUTTONS-------------
        Attack1 = new JButton();
        Attack2 = new JButton();
        Attack3 = new JButton();
        Attack4 = new JButton();
        Attack1.setText(user.getCurrentPokemon().getAttacksList().get(0).getName());
        Attack2.setText(user.getCurrentPokemon().getAttacksList().get(1).getName());
        Attack3.setText(user.getCurrentPokemon().getAttacksList().get(2).getName());
        Attack4.setText(user.getCurrentPokemon().getAttacksList().get(3).getName());
        //--------------------------------------------------------------------------------



        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();



        panel1.setBorder(BorderFactory.createTitledBorder("Attacks"));
        panel2.setBorder(BorderFactory.createTitledBorder("Items Found"));
        panel3.setBorder(BorderFactory.createTitledBorder("Boosters Found"));


        BoxLayout layout1 = new BoxLayout(panel1, BoxLayout.Y_AXIS);
        BoxLayout layout2 = new BoxLayout(panel2, BoxLayout.Y_AXIS);
        BoxLayout layout3 = new BoxLayout(panel3, BoxLayout.Y_AXIS);


        panel1.setLayout(layout1);
        panel2.setLayout(layout2);
        panel3.setLayout(layout3);

        //------------SETTING BOUNDS AND CHARACTERISTICS OF BUTTONS-----------------------

        Attack1.setAlignmentX(Component.CENTER_ALIGNMENT);
        Attack2.setAlignmentX(Component.CENTER_ALIGNMENT);
        Attack3.setAlignmentX(Component.CENTER_ALIGNMENT);
        Attack4.setAlignmentX(Component.CENTER_ALIGNMENT);
        Attack1.setBackground(new Color(101, 137, 170));
        Attack2.setBackground(new Color(101, 137, 170));
        Attack3.setBackground(new Color(101, 137, 170));
        Attack4.setBackground(new Color(101, 137, 170));

        panel1.add(Attack1);
        panel1.add(Box.createVerticalStrut(5));
        panel1.add(Attack2);
        panel1.add(Box.createVerticalStrut(5));
        panel1.add(Attack3);
        panel1.add(Box.createVerticalStrut(5));
        panel1.add(Attack4);

        panel1.setBackground(new Color(61, 65, 71));
        panel1.setBounds(60,250,150,150);

        this.add(panel1);


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
