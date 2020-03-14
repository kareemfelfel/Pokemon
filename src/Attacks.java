// Attacks class generates a number of hit point every time the function getHitPoint
// is called which makes the game feel more real.
public class Attacks {
    //Field variables
    private String Name;
    private int PowerPoints;
    private int min;
    private int max;


    //Constructor that takes Name of attack and two numbers that a random
    //number is generated between min and max every time the function get PowerPoints is called.
    public Attacks(String PName, int Pmin, int Pmax)
    {
        Name = PName;
        min = Pmin;
        max = Pmax;

    }

    //GETTERS AND SETTERS
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPowerPoints()
    {
        PowerPoints = (int)(Math.random() * (max - min + 1) + min);
        return PowerPoints;
    }

}
