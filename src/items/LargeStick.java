package items;
import pokemons.Pokemon;
public class LargeStick implements Weapons
{
    private String Name = "Large Stick";
    private int Damage = 30;
    @Override
    public void Use(Pokemon Opponent)
    {
        Opponent.setHitPoints(Opponent.getHitPoints() - Damage);
    }
}
