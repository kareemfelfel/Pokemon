package managers;

import GUI.InformationGui;
import GUI.LandingGui;
import pokemons.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listener implements ActionListener
{
    private InformationGui InfoGui;
    private LandingGui LandGui;
    private Pokemon Pokemon1;
    private Pokemon Pokemon2;
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
            CheckPokemons();
        }
        if(e.getActionCommand().equals("Next"))
        {
            JFrame InfoGui = new InformationGui();

        }

    }

    private void CheckPokemons()
    {
        //If user enters same pokemon show error message
        if(InfoGui.getCharmanderRadio1().isSelected() && InfoGui.getCharmanderRadio2().isSelected() ||
                InfoGui.getPikachuRadio1().isSelected() && InfoGui.getPikachuRadio2().isSelected() ||
                InfoGui.getEeveeRadio1().isSelected() && InfoGui.getEeveeRadio2().isSelected() ||
                InfoGui.getGengerRadio1().isSelected() && InfoGui.getGengerRadio2().isSelected())
        {
            JOptionPane.showInternalMessageDialog(null, "Thou shall not have the same pokemon",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        //if pokemon selection is valid
        else
        {
            //Getting the first pokemon selected
            if(InfoGui.getCharmanderRadio1().isSelected())
            {
                Pokemon1 = new Charmander();
            }
            else if(InfoGui.getPikachuRadio1().isSelected())
            {
                Pokemon1= new Pikachu();
            }
            else if(InfoGui.getEeveeRadio1().isSelected())
            {
                Pokemon1 = new Eevee();
            }
            else if(InfoGui.getGengerRadio1().isSelected())
            {
                Pokemon1 = new Genger();
            }

            //Getting the second selected pokemon
            if(InfoGui.getCharmanderRadio2().isSelected())
            {
                Pokemon2 = new Charmander();
            }
            else if(InfoGui.getPikachuRadio2().isSelected())
            {
                Pokemon2= new Pikachu();
            }
            else if(InfoGui.getEeveeRadio2().isSelected())
            {
                Pokemon2 = new Eevee();
            }
            else if(InfoGui.getGengerRadio2().isSelected())
            {
                Pokemon2 = new Genger();
            }
        }
    }


}
