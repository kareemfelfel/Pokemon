package GUI;
import players.Player;
import javax.swing.*;
import java.awt.*;

public class InformationGui extends JFrame
{
    private Player User;
    private String UserName;
    private JTextField NameField;
    private JRadioButton PikachuRadio1;
    private JRadioButton PikachuRadio2;
    private JRadioButton EeveeRadio1;
    private JRadioButton EeveeRadio2;
    private JRadioButton GengerRadio1;
    private JRadioButton GengerRadio2;
    private JRadioButton CharmanderRadio1;
    private JRadioButton CharmanderRadio2;
    
    public InformationGui()
    {

        CreateGui();
        CreateNorthofGui();
        CreateUserNameSection();
        CreateFirstSetofRadioButtons();
        CreateSecondSetofRadioButtons();
        AddActionListeners();
        this.setVisible(true);
    }

    private void AddActionListeners() {
    }

    private void CreateUserNameSection()
    {
        //--------------------INITIALIZE LABEL AND TEXTFIELD-------------
        JLabel NameLbl = new JLabel("Enter your name:");
        NameLbl.setForeground(Color.white);
        NameField = new JTextField();
        //---------------------------------------------------------------

        //----------------------SET BOUNDS-------------------------------
        NameField.setBounds(180,150,200,20);
        NameLbl.setBounds(20,150,150,20);
        //---------------------------------------------------------------

        //------------------------ADD ITEMS------------------------------
        this.add(NameField);
        this.add(NameLbl);

    }

    private void CreateSecondSetofRadioButtons()
    {
        //-----------------SETTING FIRST SET OF RADIOBUTTONS---------------
        // Initialization of PikachuRadioBTn
        PikachuRadio2 = new JRadioButton();
        // Initialization of object of Charmander Radio Button.
        CharmanderRadio2 = new JRadioButton();
        // Initialization of Eevee Radio Button
        EeveeRadio2 = new JRadioButton();
        //Initialization of Genger RadioButton
        GengerRadio2 = new JRadioButton();
        //------------------------------------------------------------------

        //--------INITIALIZATION OF GROUP LABEL AND BUTTONGROUP------------
        // Initialization of object of "ButtonGroup" class.
        ButtonGroup G2 = new ButtonGroup();
        // Initialization of object of " JLabel" class.
        JLabel L2 = new JLabel("Select your Second Pokemon:");
        //Setting Color of Label font
        L2.setForeground(Color.white);
        //------------------------------------------------------------------

        //------------SETTING TEXT OF FIRST SET OF POKEMONS-----------------
        PikachuRadio2.setText("Pikachu");
        CharmanderRadio2.setText("Charmander");
        EeveeRadio2.setText("Eevee");
        GengerRadio2.setText("Genger");
        //------------------------------------------------------------------

        //-------------SETTING COLORS OF TEXT RADIO BUTTONS-----------------
        PikachuRadio2.setForeground(Color.white);
        CharmanderRadio2.setForeground(Color.white);
        EeveeRadio2.setForeground(Color.white);
        GengerRadio2.setForeground(Color.white);
        //------------------------------------------------------------------

        //-----SETTING THE LOCATION OF RADIOBUTTONS ON THE SCREEN-----------
        // Setting Bounds of "jRadioButton2".
        PikachuRadio2.setBounds(200, 200, 80, 50);
        CharmanderRadio2.setBounds(300, 200, 100, 50);
        EeveeRadio2.setBounds(420,200,80,50);
        GengerRadio2.setBounds(500,200,80,50);
        //-------------------------------------------------------------------

        //--------------SETTING BACKGROUND OF RADIO BUTTONS TO GREY-----------
        PikachuRadio2.setBackground(new Color(61, 65, 71));
        CharmanderRadio2.setBackground(new Color(61, 65, 71));
        GengerRadio2.setBackground(new Color(61, 65, 71));
        EeveeRadio2.setBackground(new Color(61, 65, 71));
        //---------------------------------------------------------------------

        //------SETTING LOCATION OF POKEMON SET LABEL--------------------------
        // Setting Bounds of JLabel "L2".
        L2.setBounds(20, 200, 250, 50);
        //---------------------------------------------------------------------

        //-------------------ADDING ELEMENTS TO FRAME---------------------------
        // Add Pikachu
        this.add(PikachuRadio2);
        // Add Charmander
        this.add(CharmanderRadio2);
        // Add Eevee
        this.add(EeveeRadio2);
        //Add Genger
        this.add(GengerRadio2);
        // Adding label on frame
        this.add(L2);

        //------------------ADDING THE RADIO BUTTONS TO THE SET----------------------
        G2.add(PikachuRadio2);
        G2.add(CharmanderRadio2);
        G2.add(GengerRadio2);
        G2.add(EeveeRadio2);
        //---------------------------------------------------------------------------
    }

    private void CreateNorthofGui()
    {
        //------------------ADDS AN IMAGE TO THE TOP OF THE GUI-------------------------------
        ImageIcon imageIcon = new ImageIcon("Pics/pokemon_logo.png");
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(210, 80,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);
        JLabel TitleImage = new JLabel(imageIcon);
        TitleImage.setBounds(120,5,320,70);
        this.add(TitleImage);
        //-------------------------------------------------------------------------------------
    }

    private void CreateFirstSetofRadioButtons()
    {
        //-----------------SETTING FIRST SET OF RADIOBUTTONS---------------
        // Initialization of PikachuRadioBTn
        PikachuRadio1 = new JRadioButton();
        // Initialization of object of Charmander Radio Button.
        CharmanderRadio1 = new JRadioButton();
        // Initialization of Eevee Radio Button
        EeveeRadio1 = new JRadioButton();
        //Initialization of Genger RadioButton
        GengerRadio1 = new JRadioButton();
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
        PikachuRadio1.setBounds(200, 170, 80, 50);
        CharmanderRadio1.setBounds(300, 170, 100, 50);
        EeveeRadio1.setBounds(420,170,80,50);
        GengerRadio1.setBounds(500,170,80,50);
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
        L1.setBounds(20, 170, 250, 50);
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

    private void CreateGui() {
        //-----------------SETTING ELEMENTS OF FRAME---------
        // Setting layout as null of JFrame.
        this.setLayout(null);
        //Set Size of window
        this.setSize(600,400);
        //Changing the background color to grey
        this.getContentPane().setBackground(new Color(61, 65, 71));
        //do not allow user to resize
        this.setResizable(false);
        //set title name
        this.setTitle("Setting");
        //-----------------------------------------------------

        //------------------Title and Icon----------------------------
        ImageIcon icon = new ImageIcon("Pics/Ball.png");
        this.setIconImage(icon.getImage());
        //--------------------------------------------------------------


    }
}
