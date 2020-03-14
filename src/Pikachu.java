public class Pikachu extends Pokemon
{
    public Pikachu()
    {
       super();
       Name= "Pikachu";
       Type= "Electric";
       PictureLocation= "Pics/Pikachu.png";
    }
    @Override
    public void SetAttacks()
    {
        Attacks Shock = new Attacks( "Thunder Shock", 15,20);
        Attacks Growl = new Attacks ("Growl", 15,20);
        Attacks DoubleKick = new Attacks ("Double Kick", 10,15);
        Attacks Whip = new Attacks ("Tail Whip", 8, 10);
    }
}
