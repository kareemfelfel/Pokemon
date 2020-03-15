package items;
import pokemons.Pokemon;
public class Pepsi implements Weapons
{
    private String Name = "Legendary Pepsi";
    private int Damage = 99;
    @Override
    public void Use(Pokemon Opponent)
    {
        Opponent.setHitPoints(Opponent.getHitPoints() - Damage);
    }
}
