package zoo.animals;

public class Fish extends Animal implements Swim {

    public Fish(String name, String species, boolean run, boolean swim, boolean fly, String voice, int satiety) {
        super(name, species, run, swim, fly, voice, satiety);
    }

    public Fish(){
        super("Fish", "Travoed", false, true, false, "Bul-bul", 5);
    }


    @Override
    public void swim() {

    }

    @Override
    public void run() {

    }
}
