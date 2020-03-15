package items;
import pokemons.Pokemon;

public class Dagger implements Weapons
{
    private String Name = "Dagger";
    private int Damage = 30;
    @Override
    public void Use(Pokemon Opponent)
    {
        Opponent.setHitPoints(Opponent.getHitPoints() - Damage);
    }
}
