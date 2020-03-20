package managers;

import GUI.BattleGui;
import items.Boosters;
import players.Computer;
import players.*;
import pokemons.Attacks;
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
                //Decrease the Power Point by 1
                User.getCurrentPokemon().getAttacksList().get(0).setPowerPoints();
                //Update the attacks buttons
                Gui.UpdateAttacks();
            }
            else
            {
                Statement1 = "Your attack missed the Pokemon!";
            }
            Comp.Reply(User);
            Gui.UpdateHealth();
            Gui.UpdateImages();
            Gui.updateBoostersandItems();
        }
        //if the attack is not a miss and the powerpoint of the attack is not 0
        if(e.getActionCommand().equals(AttacksList.get(1).getName()))
        {
            if(!User.getCurrentPokemon().getAttacksList().get(1).Missed()
                    && User.getCurrentPokemon().getAttacksList().get(1).getPowerPoints()!=0) {
                User.getCurrentPokemon().getAttacksList().get(1).Use(Comp.getCurrentPokemon());
                //Decrease the Power Point by 1
                User.getCurrentPokemon().getAttacksList().get(1).setPowerPoints();
                Gui.UpdateAttacks();
            }
            else {
                Statement1 = "The Computer's Pokemon missed your attack!";
            }
            Comp.Reply(User);
            Gui.UpdateHealth();
            Gui.UpdateImages();
            Gui.updateBoostersandItems();
        }
        //if the attack is not a miss and the powerpoint of the attack is not 0
        if(e.getActionCommand().equals(AttacksList.get(2).getName()))
        {
            if(!User.getCurrentPokemon().getAttacksList().get(2).Missed()
                    && User.getCurrentPokemon().getAttacksList().get(2).getPowerPoints()!=0) {
                User.getCurrentPokemon().getAttacksList().get(2).Use(Comp.getCurrentPokemon());
                //Decrease the Power Point by 1
                User.getCurrentPokemon().getAttacksList().get(2).setPowerPoints();
                Gui.UpdateAttacks();
            }
            else {
                Statement1 = "The Computer's Pokemon missed your attack!";
            }
            Comp.Reply(User);
            Gui.UpdateHealth();
            Gui.UpdateImages();
            Gui.updateBoostersandItems();
        }
        //if the attack is not a miss and the powerpoint of the attack is not 0
        if(e.getActionCommand().equals(AttacksList.get(3).getName()))
        {
            if(!User.getCurrentPokemon().getAttacksList().get(3).Missed()
                    && User.getCurrentPokemon().getAttacksList().get(3).getPowerPoints()!=0) {
                User.getCurrentPokemon().getAttacksList().get(3).Use(Comp.getCurrentPokemon());
                //Decrease the Power Point by 1
                User.getCurrentPokemon().getAttacksList().get(3).setPowerPoints();
                Gui.UpdateAttacks();

            }
            else {
                Statement1 = "The Computer's Pokemon missed your attack!";
            }
            Comp.Reply(User);
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
            Comp.Reply(User);
            Gui.UpdateImages();
            //update health on screen
            Gui.UpdateHealth();
            //updateBoosters and Items
            Gui.updateBoostersandItems();
        }
    }
}
