package items;
import pokemons.Pokemon;
public class DietPepsi implements Weapons
{
    private String Name = "Diet Pepsi Can";
    private int Damage = 10;
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
