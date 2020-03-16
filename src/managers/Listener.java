package managers;

import GUI.InformationGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener
{
    private JFrame Gui;
    public Listener(JFrame pGui)
    {
        Gui = pGui;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Start"))
        {
            JOptionPane.showInternalMessageDialog(null, "Works",
                    "I Work!", JOptionPane.INFORMATION_MESSAGE);
        }
        if(e.getActionCommand().equals("Next"))
        {
            JFrame InfoGui = new InformationGui();


        }

    }
}
