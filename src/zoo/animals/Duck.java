package zoo.animals;

public class Duck extends Animal implements Fly, Run, Swim, Voice{

    public Duck(String name, String species, boolean run, boolean swim, boolean fly, String voice, int satiety) {
        super(name, species, run, swim, fly, voice, satiety);
    }

    public Duck(){
        super("Duck", "Travoed", true, true, true, "Kria-kria", 5);
    }

    @Override
    public void fly() {
    }

    @Override
    public void swim() {
    }

    @Override
    public void run() {
    }

    @Override
    public void voice() {
    }

    @Override
    public String strVoice() {
        return "Kria-kria";
    }
}
