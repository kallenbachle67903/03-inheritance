package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {

    public int getT() {
        return t;
    }

    protected int t;

    public int getDuration() {
        return duration;
    }

    private int duration;
    private static final Logger logger = LogManager.getLogger();

    public State(int duration)
    {
      this.duration = duration;
    }
    final State tick(Cat cat)
    {
        if (duration < 0){
            return this;
        }
        t= t+1;
        if (t  <duration){
            return this;
        }
        else {
            return successor(cat);
        }
    }
    abstract State successor(Cat cat);
}
