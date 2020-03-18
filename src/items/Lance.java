package items;
import pokemons.Pokemon;
public class Lance implements Weapons
{
    private String Name = "Lance";
    private int Damage = 55;
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
