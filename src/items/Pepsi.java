package items;
import pokemons.Pokemon;
public class Pepsi implements Weapons
{
    private String Name = "Legendary Pepsi Plastic Bottle";
    private int Damage = 75;
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
