package managers;

import GUI.BattleGui;
import players.Player;
import pokemons.Attacks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Master implements ActionListener {
    private BattleGui Gui;
    private Player User;
    private Player Comp;
    private ArrayList<Attacks> AttacksList;
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
        //If any attack button is pressed
        if(e.getActionCommand().equals(AttacksList.get(0).getName()))
        {
            User.getCurrentPokemon().getAttacksList().get(0).Use(Comp.getCurrentPokemon());
            Gui.UpdateHealth();
        }
        if(e.getActionCommand().equals(AttacksList.get(1).getName()))
        {
            User.getCurrentPokemon().getAttacksList().get(1).Use(Comp.getCurrentPokemon());
            Gui.UpdateHealth();
        }
        if(e.getActionCommand().equals(AttacksList.get(2).getName()))
        {
            User.getCurrentPokemon().getAttacksList().get(2).Use(Comp.getCurrentPokemon());
            Gui.UpdateHealth();
        }
        if(e.getActionCommand().equals(AttacksList.get(3).getName()))
        {
            User.getCurrentPokemon().getAttacksList().get(3).Use(Comp.getCurrentPokemon());
            Gui.UpdateHealth();
        }
    }
}
