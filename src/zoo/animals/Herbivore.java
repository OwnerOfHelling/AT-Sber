package zoo.animals;

import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;

public abstract class Herbivore extends Animal {

    public Herbivore(String name, int satiety) {
        super(name, satiety);
    }

    public String getName() {
        return name;
    }

    /*public void eat(Food food){
        if (food instanceof Grass)
            System.out.println(name+" съел "+food);
        if (food instanceof Meat)
            System.out.println(name+" не ест "+food);
    }*/

    @Override
    protected boolean foodAccepted(Food food) {
        return food instanceof Grass;
    }

}
