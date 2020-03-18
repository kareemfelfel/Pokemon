package items;
import pokemons.Pokemon;

public class SwitchBlade implements Weapons
{
    private String Name = "Switch Blade";
    private int Damage = 25;
    @Override
    public void Use(Pokemon Opponent)
    {
        int TemporaryDamage = Opponent.getHitPoints() - Damage;
        if(TemporaryDamage < 0)
            Opponent.setHitPoints(0);
        else
            Opponent.setHitPoints(Opponent.getHitPoints() - Damage);
    }
}
