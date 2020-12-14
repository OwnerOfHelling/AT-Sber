package zoo.animals;

import zoo.food.Food;
import zoo.food.Grass;

public abstract class Herbivore extends Animal {

    public Herbivore(String name, int satiety) {
        super(name, satiety);
    }

    public String getName() {
        return name;
    }

    /*@Override
    protected boolean food(Food food) {
        return food instanceof Grass;
    }*/
}
