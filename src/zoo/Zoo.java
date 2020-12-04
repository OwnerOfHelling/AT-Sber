package zoo;

import zoo.animals.Duck;
import zoo.animals.Fish;

public class Zoo {

    public static void main(String[] args) {

        Duck duck = new Duck();
        duck.fly();
        duck.run();
        duck.swim();
        duck.voice();

        Fish fish = new Fish();
        fish.swim();

    }



}
