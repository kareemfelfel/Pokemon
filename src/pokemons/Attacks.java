package pokemons;
// Attacks class generates a number of hit point every time the function getHitPoint
// is called which makes the game feel more real.
public class Attacks {
    //Field variables
    private String Name;
    private int PowerPoints;
    private int min;
    private int max;
    private int Damage;


    //Constructor that takes Name of attack and two numbers that a random
    //number is generated between min and max every time the function get PowerPoints is called.
    public Attacks(String PName, int Pmin, int Pmax, int PP)
    {
        Name = PName;
        min = Pmin;
        max = Pmax;
        PowerPoints= PP;

    }

    //GETTERS AND SETTERS
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDamage()
    {
        Damage = (int)(Math.random() * (max - min + 1) + min);
        return Damage;
    }
    public void decreasePowerPoints()
    {
        PowerPoints-=1;
    }
    public int getPowerPoints()
    {
        return PowerPoints;
    }

}
