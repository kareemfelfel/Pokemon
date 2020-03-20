package managers;

import GUI.BattleGui;
import GUI.InformationGui;
import items.Boosters;
import players.Computer;
import players.*;
import pokemons.Attacks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Master implements ActionListener {
    private BattleGui Gui;
    private Player User;
    private Computer Comp;
    private ArrayList<Attacks> AttacksList;
    private String Statement1;
    private String Statement2;
    public Master(BattleGui PGui)
    {
        Gui = PGui;
        User = Gui.getUser();
        Comp = Gui.getComputer();
        AttacksList = User.getCurrentPokemon().getAttacksList();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Statement1 ="";
        Statement2="";
        //Update AttacksList
        AttacksList = User.getCurrentPokemon().getAttacksList();
        //If any attack button is pressed
        if(e.getActionCommand().equals(AttacksList.get(0).getName()))
        {
            //if the attack is not a miss and the powerpoint of the attack is not 0
            if(!User.getCurrentPokemon().getAttacksList().get(0).Missed()
                    && User.getCurrentPokemon().getAttacksList().get(0).getPowerPoints()!=0)
            {
                //call the use function of the attack and send the opponent's pokemon
                User.getCurrentPokemon().getAttacksList().get(0).Use(Comp.getCurrentPokemon());
                //Declare Statement1
                Statement1 = "Your Pokemon used "+ User.getCurrentPokemon().getAttacksList().get(0).getName() +" attack on "
                        + Comp.getCurrentPokemon().getName();
                //Decrease the Power Point by 1
                User.getCurrentPokemon().getAttacksList().get(0).setPowerPoints();
                //Update the attacks buttons
                Gui.UpdateAttacks();
            }
            else
            {
                Statement1 = "Your attack missed the Pokemon!";
            }
            Statement2 = Comp.Reply(User);
            Gui.UpdateHealth();
            Gui.UpdateImages();
            Gui.updateBoostersandItems();
        }
        //if the attack is not a miss and the powerpoint of the attack is not 0
        else if(e.getActionCommand().equals(AttacksList.get(1).getName()))
        {
            if(!User.getCurrentPokemon().getAttacksList().get(1).Missed()
                    && User.getCurrentPokemon().getAttacksList().get(1).getPowerPoints()!=0) {
                User.getCurrentPokemon().getAttacksList().get(1).Use(Comp.getCurrentPokemon());
                Statement1 = "Your Pokemon used "+ User.getCurrentPokemon().getAttacksList().get(1).getName() +" attack on "
                        + Comp.getCurrentPokemon().getName();
                //Decrease the Power Point by 1
                User.getCurrentPokemon().getAttacksList().get(1).setPowerPoints();
                Gui.UpdateAttacks();
            }
            else {
                Statement1 = "The Computer's Pokemon missed your attack!";
            }
            Statement2 = Comp.Reply(User);
            Gui.UpdateHealth();
            Gui.UpdateImages();
            Gui.updateBoostersandItems();
        }
        //if the attack is not a miss and the powerpoint of the attack is not 0
        else if(e.getActionCommand().equals(AttacksList.get(2).getName()))
        {
            if(!User.getCurrentPokemon().getAttacksList().get(2).Missed()
                    && User.getCurrentPokemon().getAttacksList().get(2).getPowerPoints()!=0) {
                User.getCurrentPokemon().getAttacksList().get(2).Use(Comp.getCurrentPokemon());
                Statement1 = "Your Pokemon used "+ User.getCurrentPokemon().getAttacksList().get(2).getName() +" attack on "
                        + Comp.getCurrentPokemon().getName();
                //Decrease the Power Point by 1
                User.getCurrentPokemon().getAttacksList().get(2).setPowerPoints();
                Gui.UpdateAttacks();
            }
            else {
                Statement1 = "The Computer's Pokemon missed your attack!";
            }
            Statement2 = Comp.Reply(User);
            Gui.UpdateHealth();
            Gui.UpdateImages();
            Gui.updateBoostersandItems();
        }
        //if the attack is not a miss and the powerpoint of the attack is not 0
        else if(e.getActionCommand().equals(AttacksList.get(3).getName()))
        {
            if(!User.getCurrentPokemon().getAttacksList().get(3).Missed()
                    && User.getCurrentPokemon().getAttacksList().get(3).getPowerPoints()!=0) {
                User.getCurrentPokemon().getAttacksList().get(3).Use(Comp.getCurrentPokemon());
                Statement1 = "Your Pokemon used "+ User.getCurrentPokemon().getAttacksList().get(3).getName() +" attack on "
                        + Comp.getCurrentPokemon().getName();
                //Decrease the Power Point by 1
                User.getCurrentPokemon().getAttacksList().get(3).setPowerPoints();
                Gui.UpdateAttacks();

            }
            else {
                Statement1 = "The Computer's Pokemon missed your attack!";
            }
            Statement2 = Comp.Reply(User);
            Gui.UpdateHealth();
            Gui.UpdateImages();
            Gui.updateBoostersandItems();
        }
        //If command is switch
        if(e.getActionCommand().equals("Switch!"))
        {
            if (User.getCurrentPokemon().equals(User.getPokemon1()))
            {
                User.setCurrentPokemon(User.getPokemon2());

            }
            else if (User.getCurrentPokemon().equals(User.getPokemon2()))
            {
                User.setCurrentPokemon(User.getPokemon1());

            }
            Gui.UpdateHealth();
            Gui.UpdateAttacks();
            Gui.UpdateImages();
            Gui.UpdateAttacks();
            Gui.updateBoostersandItems();

        }
        //if booster button is pressed
        if(Gui.getBoosterFound()!=null && e.getActionCommand().equals(Gui.getBoosterFound().getName()))
        {
            //Use that booster
            Gui.getBoosterFound().use(User);
            Statement1 = "Your Pokemon found a "+ Gui.getBoosterFound().getName() +" and used it. Your health is increased by "
                    + Gui.getBoosterFound().getBonus() + " points!";
            //update health on Gui
            Gui.UpdateHealth();
            //Update boosters and Items buttons
            Gui.updateBoostersandItems();
        }
        //if weapons button is pressed
        if(Gui.getWeaponFound()!=null && e.getActionCommand().equals(Gui.getWeaponFound().getName()))
        {
            //use that weapon
            Gui.getWeaponFound().Use(Comp.getCurrentPokemon());
            Statement1 = "Your Pokemon found a "+ Gui.getWeaponFound().getName() +" and used it on " + Comp.getCurrentPokemon().getName();
            Statement2 = Comp.Reply(User);
            Gui.UpdateImages();
            //update health on screen
            Gui.UpdateHealth();
            //updateBoosters and Items
            Gui.updateBoostersandItems();
        }
        CompileStatements(Statement1, Statement2);
        CheckIfGameIsOver();
    }

    private void CheckIfGameIsOver()
    {
        //If User's pokemon has 0 HitPoints, the game is over
        if(User.getCurrentPokemon().getHitPoints()==0)
        {
            int response = JOptionPane.showConfirmDialog(null, "You Lost! Play again?", "Game Over",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.NO_OPTION) {
                Gui.dispose();
            } else if (response == JOptionPane.YES_OPTION) {
                InformationGui InfoG = new InformationGui();
                Gui.dispose();
            } else if (response == JOptionPane.CLOSED_OPTION) {
                Gui.dispose();
            }
        }
        //If Computer's pokemon is dead User wins!
        else if(Comp.getCurrentPokemon().getHitPoints()==0)
        {
            int response = JOptionPane.showConfirmDialog(null, "You won! Play again?", "Congrats!",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.NO_OPTION) {
                Gui.dispose();
            } else if (response == JOptionPane.YES_OPTION) {
                InformationGui InfoG = new InformationGui();
                Gui.dispose();
            } else if (response == JOptionPane.CLOSED_OPTION) {
                Gui.dispose();
            }
        }
    }

    private void CompileStatements(String statement1, String statement2)
    {
        String STATEMENT = "";
        if(statement1 != "" && statement2!= "")
            STATEMENT = "<html><ul><li>"+statement1+"</li>"+"<li>"+statement2+"</li></ul></html>";
        else if(statement1!="" && statement2=="")
        {
            STATEMENT = "<html><ul><li>"+statement1+"</li></ul></html>";
        }
        else if(statement1=="" && statement2!="")
        {
            STATEMENT = "<html><ul><li>"+statement2+"</li></ul></html>";
        }
        Gui.UpdateStatement(STATEMENT);
    }
}
