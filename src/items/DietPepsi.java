package items;
import pokemons.Pokemon;
public class DietPepsi implements Weapons
{
    private String Name = "Diet Pepsi...";
    private int Damage = 10;
    @Override
    public void Use(Pokemon Opponent)
    {
        Opponent.setHitPoints(Opponent.getHitPoints() - Damage);
    }
}
