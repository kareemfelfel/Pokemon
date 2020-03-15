package items;
import items.*;
import pokemons.*;

public class Hammer implements Weapons {
    private String Name = "Hammer";
    private int Damage = 45;
    @Override
    public void Use(Pokemon Opponent)
    {
        Opponent.setHitPoints(Opponent.getHitPoints() - Damage);
    }
}
