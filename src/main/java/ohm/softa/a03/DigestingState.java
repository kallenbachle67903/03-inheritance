package ohm.softa.a03;

public class DigestingState extends State{


    public DigestingState(int duration) {
        super(duration);
    }
}

public State successor(Cat cat){
    return new PlayfulState();
}
