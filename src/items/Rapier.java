package items;
import pokemons.Pokemon;
public class Rapier implements Weapons
{
    private String Name = "Rapier";
    private int Damage = 40;
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
