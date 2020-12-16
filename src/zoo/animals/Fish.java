package zoo.animals;

import zoo.food.Food;

public class Fish extends Herbivore implements Swim {

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
