package items;

import pokemons.Pokemon;

public class Sword implements Weapons {
    private String Name = "Hammer";
    private int Damage = 50;
    @Override
    public void Use(Pokemon Opponent)
    {
        Opponent.setHitPoints(Opponent.getHitPoints() - Damage);
    }
}
