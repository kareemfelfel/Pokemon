package items;
import players.Player;
import pokemons.Pokemon;

public class Apple implements Boosters
{
    private String Name = "Apple";
    private int Bonus = 10;
    @Override
    public void use(Player UserPlayer) {
        int TemporaryHP = UserPlayer.getCurrentPokemon().getHitPoints() + Bonus;
        if(TemporaryHP > 100)
            UserPlayer.getCurrentPokemon().setHitPoints(100);
        else
            UserPlayer.getCurrentPokemon().setHitPoints(UserPlayer.getCurrentPokemon().getHitPoints() + Bonus);
    }
}
