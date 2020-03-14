import javax.swing.*;
import java.awt.*;

public class LandingGui extends JFrame
{
    private JLabel title;
    //Constructor
    public LandingGui()
    {
        SetInitialGui();
        this.setVisible(true);
    }
    public void SetInitialGui()
    {
        this.setTitle("Introduction");
        title = new JLabel("Pokemon Battle");
        Font TimesNewRoman = new Font("times new roman",Font.ITALIC,20);
        title.setFont(TimesNewRoman);
        title.setBackground(Color.green);
        this.setSize(380,450);
        this.setBackground(Color.green);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        title.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        title.setVerticalAlignment((int) CENTER_ALIGNMENT);
        this.add(title, BorderLayout.NORTH);
        this.setVisible(true);
    }
}
