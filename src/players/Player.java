package players;
import items.*;
import pokemons.*;
import java.util.ArrayList;
import java.util.Random;

public abstract class Player
{
    //Fields
    protected String PlayerName;
    protected Pokemon Pokemon1;
    protected Pokemon Pokemon2;
    protected Pokemon CurrentPokemon;
    protected ArrayList<Weapons> ItemsList;
    protected boolean ItemIsFound;

    //GETTERS AND SETTERS
    public Pokemon getPokemon1() {
        return Pokemon1;
    }

    public void setPokemon1(Pokemon pokemon1) {
        Pokemon1 = pokemon1;
    }

    public Pokemon getPokemon2() {
        return Pokemon2;
    }

    public void setPokemon2(Pokemon pokemon2) {
        Pokemon2 = pokemon2;
    }

    public Pokemon getCurrentPokemon() {
        return CurrentPokemon;
    }

    public void setCurrentPokemon(Pokemon currentPokemon) {
        CurrentPokemon = currentPokemon;
    }


    //Constructor
    public Player(String Pname, Pokemon P1, Pokemon P2)
    {
        PlayerName = Pname;
        Pokemon1 = P1;
        Pokemon2 = P2;
        CurrentPokemon = Pokemon1;
        //AddItemsToArrayList();
    }
    private void AddItemsToArrayList()
    {
        ItemsList.add(new Hammer());
    }

    public void ChoosePokemon(){

    }
    public void ChooseItem()
    {

    }
    public boolean ItemFound()
    {
        //Generate a random number between 0 and 100
        int RandomNum = (int)(Math.random() * (100 - 0 + 1) + 0);
        // There is a 25% chance that the player might find an Item after playing a hit
        if (RandomNum >75)
            ItemIsFound = true;
        else
            ItemIsFound = false;
        return ItemIsFound;
    }
    //function that returns a random Item from the list of Items
    public Weapons GetItem()
    {
        Random random = new Random();
        Weapons Item = ItemsList.get(random.nextInt(ItemsList.size()));
        return Item;
    }
}
