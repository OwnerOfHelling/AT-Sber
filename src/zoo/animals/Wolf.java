package zoo.animals;

import zoo.food.Food;

public class Wolf extends Carnivorous implements Run, Swim, Voice{

    public Wolf(){
        super("Акелла", 3);
    }

    @Override
    public void run() {
        System.out.println(getName()+" ходит по вальеру");
    }

    @Override
    public void swim() {
        System.out.println(getName()+" не любит плавать");
    }

    @Override
    public void voice() {
        System.out.println(getName()+" воет");
    }

}
