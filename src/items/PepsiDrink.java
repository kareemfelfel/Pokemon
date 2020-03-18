package items;
import players.Player;
import pokemons.Pokemon;

public class PepsiDrink implements Boosters
{
    private String Name = "Ice Cold Pepsi";
    private int Bonus = 50;
    @Override
    public void use(Player UserPlayer) {

        int TemporaryHP = UserPlayer.getCurrentPokemon().getHitPoints() + Bonus;
        if(TemporaryHP > 100)
            UserPlayer.getCurrentPokemon().setHitPoints(100);
        else
            UserPlayer.getCurrentPokemon().setHitPoints(UserPlayer.getCurrentPokemon().getHitPoints() + Bonus);
    }
}
