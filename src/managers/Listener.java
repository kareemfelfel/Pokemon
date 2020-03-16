package managers;

import GUI.InformationGui;
import GUI.LandingGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener
{
    private InformationGui InfoGui;
    private LandingGui LandGui;
    public Listener()
    {

    }
    public void SendInfoGui(InformationGui PGui)
    {
        InfoGui = PGui;
    }
    public void SendLandGui(LandingGui pGui)
    {
        LandGui = pGui;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Start"))
        {

            String UserName = InfoGui.getNameField().getText();
            JOptionPane.showInternalMessageDialog(null, "Hi " +UserName,
                    "I Work!", JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getActionCommand().equals("Next"))
        {
            JFrame InfoGui = new InformationGui();


        }

    }
}
