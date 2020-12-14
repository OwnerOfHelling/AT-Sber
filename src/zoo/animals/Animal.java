package zoo.animals;

import zoo.food.Food;
import zoo.food.Grass;
import zoo.food.Meat;

public abstract class Animal {

    public String name;
    public int satiety;


    public Animal(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public void eat(Food food){
        if (food instanceof Grass)
            System.out.println(name + " съел еду");
        if (food instanceof Meat)
            System.out.println(name + " не ест такую еду.");
    }

}
