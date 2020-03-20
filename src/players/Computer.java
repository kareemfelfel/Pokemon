package players;
import items.Boosters;
import items.Weapons;
import pokemons.*;

import java.util.Random;

public class Computer extends Player
{
    public Computer(Pokemon P1, Pokemon P2) {
        super("Computer", P1, P2);
    }
    public void Reply(Player User)
    {
        //If an Item is found
        if (ItemFound())
        {
            //get that item ad set button property to same text
            Weapons weaponFound= GetItem();
            weaponFound.Use(User.getCurrentPokemon());

        }
        //if a booster is found
        else if(BoosterIsFound() && getCurrentPokemon().getHitPoints()<100)
        {
            Boosters boosterFound = getBooster();
            boosterFound.use(this);

        }
        else if(getCurrentPokemon().getHitPoints()<= 10 && getCurrentPokemon().getHitPoints()!= 0)
        {
            if(getCurrentPokemon().equals(Pokemon1))
            {
                setCurrentPokemon(Pokemon2);
            }
            else if(getCurrentPokemon().equals(Pokemon2))
            {
                setCurrentPokemon(Pokemon1);
            }
        }
        else
        {
            if(!getCurrentPokemon().getAttacksList().get(0).Missed()) {
                Random random = new Random();
                Attacks attack = getCurrentPokemon().getAttacksList().get(random.nextInt(BoostersList.size()));
                attack.Use(User.getCurrentPokemon());
            }
        }
    }
}
