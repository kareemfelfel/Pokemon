package items;
import pokemons.Pokemon;

public class SwitchBlade implements Weapons
{
    private String Name = "Switch Blade";
    private int Damage = 25;
    @Override
    public void Use(Pokemon Opponent)
    {
        Opponent.setHitPoints(Opponent.getHitPoints() - Damage);
    }
}
