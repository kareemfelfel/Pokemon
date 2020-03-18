package items;

import players.Player;

public class OrganicDrink implements Boosters {
    private String Name = "Organic Drink";
    private int Bonus = 5;
    @Override
    public void use(Player UserPlayer)
    {
        int TemporaryHP = UserPlayer.getCurrentPokemon().getHitPoints() + Bonus;
        if(TemporaryHP > 100)
            UserPlayer.getCurrentPokemon().setHitPoints(100);
        else
            UserPlayer.getCurrentPokemon().setHitPoints(UserPlayer.getCurrentPokemon().getHitPoints() + Bonus);
    }
}
