public class HammerItem implements Weapons {
    private String Name= "Hammer";
    private int min;
    private int max;
    private int PowerPoint;
    public HammerItem(int Pmin, int Pmax)
    {
        min= Pmin;
        max = Pmax;
        PowerPoint= 0;
    }
    @Override
    public void Use() {
        PowerPoint = (int)(Math.random() * (max - min + 1) + min);

    }
}
