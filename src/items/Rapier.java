package items;
import pokemons.Pokemon;
public class Rapier implements Weapons
{
    private String Name = "Rapier";
    private int Damage = 40;
    @Override
    public void Use(Pokemon Opponent)
    {
        Opponent.setHitPoints(Opponent.getHitPoints() - Damage);
    }
}
