package zoo;

import zoo.animals.Animal;
import zoo.animals.Voice;
import zoo.food.Food;

public class Worker {
    public Worker() {
    }

    void feed(Animal animal, Food food) {
    animal.eat(food);
    }

    void getVoice(Voice animal) {
        animal.voice();
    }
}
