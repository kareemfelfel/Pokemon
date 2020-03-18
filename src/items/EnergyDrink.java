package items;
import players.Player;
import players.User;

public class EnergyDrink implements Boosters {
    private String Name = "Energy Drink";
    private int Bonus = 25;
    @Override
    public void use(Player UserPlayer) {
        int TemporaryHP = UserPlayer.getCurrentPokemon().getHitPoints() + Bonus;
        if(TemporaryHP > 100)
            UserPlayer.getCurrentPokemon().setHitPoints(100);
        if(TemporaryHP <= 25)
        {
            UserPlayer.getCurrentPokemon().setHitPoints(UserPlayer.getCurrentPokemon().getHitPoints() + Bonus + 25);
        }
        else
            UserPlayer.getCurrentPokemon().setHitPoints(UserPlayer.getCurrentPokemon().getHitPoints() + Bonus);
    }
}
