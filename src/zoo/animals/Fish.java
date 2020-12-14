package zoo.animals;

public class Fish extends Carnivorous implements Swim {

    public Fish() {
        super("Карась", 3);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плавает в озере.");
    }

    @Override
    public void run() {

    }
}
