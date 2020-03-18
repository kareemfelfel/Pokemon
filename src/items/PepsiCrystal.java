package items;
import players.Player;

public class PepsiCrystal implements Boosters {
    private String Name = "Crystal Pepsi";
    private int Bonus = 55;
    @Override
    public void use(Player UserPlayer) {
        int TemporaryHP = UserPlayer.getCurrentPokemon().getHitPoints() + Bonus;
        if(TemporaryHP > 100)
            UserPlayer.getCurrentPokemon().setHitPoints(100);
        else
            UserPlayer.getCurrentPokemon().setHitPoints(UserPlayer.getCurrentPokemon().getHitPoints() + Bonus);
    }
}
