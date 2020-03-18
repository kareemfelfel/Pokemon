package items;
import pokemons.Pokemon;

public class Dagger implements Weapons
{
    private String Name = "Dagger";
    private int Damage = 30;
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
