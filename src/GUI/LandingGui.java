package GUI;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LandingGui extends JFrame
{
    private JLabel title;
    private JButton BtnNext;
    //Constructor
    public LandingGui()
    {
        SetInitialGui();
        SetNext();
        SetInformation();
        //Set Size
        this.setSize(500,600);
        this.setVisible(true);
    }

    private void SetInformation()
    {

    }

    //function that sets the button next
    public void SetNext()
    {
        //create a panel
        JPanel pane = new JPanel();
        // set the panel's layout as box layout on one line axis
        pane.setLayout(new BoxLayout(pane, BoxLayout.LINE_AXIS));
        //set background color of panel to the same default color we are using
        pane.setBackground(new Color(61, 65, 71));
        //set padding for the panel
        pane.setBorder(new EmptyBorder(10, 10, 10, 10));
        //initiate button Next
        BtnNext= new JButton("Next");
        // set button background color to be green
        BtnNext.setBackground(new Color(40, 168, 75));
        //
        pane.add(Box.createHorizontalGlue());
        pane.add(BtnNext);
        this.add(pane, BorderLayout.SOUTH);
        this.pack();
    }
    // function that sets initial GUI
    public void SetInitialGui()
    {
        //Set Size
        this.setSize(500,600);
        //do not allow user to resize
        this.setResizable(false);
        //set title name
        this.setTitle("Introduction");
        // set background of application
        this.getContentPane().setBackground(new Color(61, 65, 71));
        title = new JLabel("Pokemon Battle");
        Font TimesNewRoman = new Font("times new roman",Font.BOLD,25);
        title.setFont(TimesNewRoman);
        // Change text color to white
        title.setForeground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        title.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        title.setVerticalAlignment((int) CENTER_ALIGNMENT);
        this.add(title, BorderLayout.NORTH);

    }
}
