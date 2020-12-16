package zoo;

import zoo.animals.Animal;
import zoo.animals.Voice;
import zoo.food.Food;

public class Worker {
    public Worker() {
    }

    void feed(Animal animal, Food food){
        try {
            animal.eat(food);
        } catch (Animal.WrongFoodException e){
            System.out.println(e.getMessage());
        }

    }

    void getVoice(Voice animal) {
        animal.voice();
    }
}
