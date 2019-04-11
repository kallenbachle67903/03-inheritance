package ohm.softa.a03;

public class HungryState extends State{
    State feed(Cat cat)
    {

        return null;
    }
    public State successor(Cat cat){
        return new DeathState();
    }
}
