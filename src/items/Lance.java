package items;
import pokemons.Pokemon;
public class Lance implements Weapons
{
    private String Name = "Lance";
    private int Damage = 60;
    @Override
    public void Use(Pokemon Opponent)
    {
        Opponent.setHitPoints(Opponent.getHitPoints() - Damage);
    }
}