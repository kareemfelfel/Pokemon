package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class InformationGui extends JFrame
{
    public InformationGui()
    {
        CreateGui();
        this.setVisible(true);
    }

    private void CreateGui() {
        //-----------------SETTING ELEMENTS OF FRAME---------
        // Setting layout as null of JFrame.
        this.setLayout(null);
        //Set Size of window
        this.setSize(600,400);
        //Changing the background color to grey
        this.getContentPane().setBackground(new Color(61, 65, 71));
        //-----------------------------------------------------

        //-----------------SETTING FIRST SET OF RADIOBUTTONS---------------
        // Initialization of PikachuRadioBTn
        JRadioButton PikachuRadio1 = new JRadioButton();
        // Initialization of object of Charmander Radio Button.
        JRadioButton CharmanderRadio1 = new JRadioButton();
        // Initialization of Eevee Radio Button
        JRadioButton EeveeRadio1 = new JRadioButton();
        //Initialization of Genger RadioButton
        JRadioButton GengerRadio1 = new JRadioButton();
        //------------------------------------------------------------------

        //-----------------INITIALIZATION OF START BUTTON------------------
        //Initialization of Start Button
        JButton Start = new JButton("Start");
        //Changing background of Start button to green
        Start.setBackground(new Color(40, 168, 75));
        //-----------------------------------------------------------------

        //--------INITIALIZATION OF GROUP LABEL AND BUTTONGROUP------------
        // Initialization of object of "ButtonGroup" class.
        ButtonGroup G1 = new ButtonGroup();
        // Initialization of object of " JLabel" class.
        JLabel L1 = new JLabel("Select your First Pokemon:");
        //Setting Color of Label font
        L1.setForeground(Color.white);
        //------------------------------------------------------------------

        //------------SETTING TEXT OF FIRST SET OF POKEMONS-----------------
        PikachuRadio1.setText("Pikachu");
        CharmanderRadio1.setText("Charmander");
        EeveeRadio1.setText("Eevee");
        GengerRadio1.setText("Genger");
        //------------------------------------------------------------------

        //-------------SETTING COLORS OF TEXT RADIO BUTTONS-----------------
        PikachuRadio1.setForeground(Color.white);
        CharmanderRadio1.setForeground(Color.white);
        EeveeRadio1.setForeground(Color.white);
        GengerRadio1.setForeground(Color.white);
        //------------------------------------------------------------------

        //-----SETTING THE LOCATION OF RADIOBUTTONS ON THE SCREEN-----------
        // Setting Bounds of "jRadioButton2".
        PikachuRadio1.setBounds(200, 100, 80, 50);
        CharmanderRadio1.setBounds(300, 100, 100, 50);
        EeveeRadio1.setBounds(420,100,80,50);
        GengerRadio1.setBounds(500,100,80,50);
        //-------------------------------------------------------------------

        //--------------SETTING BACKGROUND OF RADIO BUTTONS TO GREY-----------
        PikachuRadio1.setBackground(new Color(61, 65, 71));
        CharmanderRadio1.setBackground(new Color(61, 65, 71));
        GengerRadio1.setBackground(new Color(61, 65, 71));
        EeveeRadio1.setBackground(new Color(61, 65, 71));
        //---------------------------------------------------------------------

        //------SETTING LOCATION OF START BUTTON AND POKEMON SET LABEL---------
        // Setting Bounds of "jButton".
        Start.setBounds(400, 300, 80, 30);
        // Setting Bounds of JLabel "L2".
        L1.setBounds(20, 100, 250, 50);
        //---------------------------------------------------------------------

        //-------------------ADDING ELEMENTS TO FRAME---------------------------
        // Add Pikachu
        this.add(PikachuRadio1);
        // Add Charmander
        this.add(CharmanderRadio1);
        // Add Eevee
        this.add(EeveeRadio1);
        //Add Genger
        this.add(GengerRadio1);
        // Adding Start button
        this.add(Start);
        // Adding label on frame
        this.add(L1);

        //------------------ADDING THE RADIO BUTTONS TO THE SET----------------------
        G1.add(PikachuRadio1);
        G1.add(CharmanderRadio1);
        G1.add(GengerRadio1);
        G1.add(EeveeRadio1);
        //---------------------------------------------------------------------------
    }
}
