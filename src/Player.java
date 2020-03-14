import java.util.ArrayList;
import java.util.Random;

public abstract class Player
{
    protected Pokemon Pokemon1;
    protected Pokemon Pokemon2;
    protected Pokemon CurrentPokemon;
    protected ArrayList<Weapons> ItemsList;
    protected boolean ItemIsFound;
    protected Weapons Item;

    //Constructor
    public Player(Pokemon P1, Pokemon P2)
    {
        Pokemon1 = P1;
        Pokemon2 = P2;
        CurrentPokemon = Pokemon1;
        AddItemsToArrayList();
    }

    private void AddItemsToArrayList()
    {

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
        Item = ItemsList.get(random.nextInt(ItemsList.size()));
        return Item;
    }
}
