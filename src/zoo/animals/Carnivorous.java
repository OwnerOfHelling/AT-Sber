package zoo.animals;

import zoo.food.Food;
import zoo.food.Meat;

public abstract class Carnivorous extends Animal{

    public Carnivorous(String name, int satiety){
        super(name, satiety);
    }

    public String getName(){
        return name;
    }

    /*@Override
    protected boolean food(Food food) {
        return food instanceof Meat;
    }*/
}
