public class Hammer implements Weapons {
    private String Name = "Hammer";
    private int PowerPoint = 45;
    @Override
    public void Use(Pokemon Opponent)
    {
        Opponent.setHitPoints(Opponent.getHitPoints() - PowerPoint);
    }
}
