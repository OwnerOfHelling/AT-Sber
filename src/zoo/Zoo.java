package zoo;

import zoo.animals.*;
import zoo.food.Grass;
import zoo.food.Meat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zoo {

    public static void main(String[] args) {

        HashMap<String, Animal> zoo = new HashMap<>();
        for (Map.Entry<String, Animal> entry : zoo.entrySet()) {
            System.out.println(entry.getKey());
        }
        Grass grass = new Grass("еду для травоядных", 3);
        Meat meat = new Meat("мясо", 3);
        Duck duck = new Duck();
        Fish fish = new Fish();
        Otter otter = new Otter();
        Lion lion = new Lion();
        Wolf wolf = new Wolf();
        Worker worker = new Worker();
        zoo.put(duck.getName(), duck);
        zoo.put(fish.getName(), fish);
        zoo.put(otter.getName(), otter);
        zoo.put(lion.getName(), lion);
        zoo.put(wolf.getName(), wolf);

        List<Swim> lake = Arrays.asList(otter, fish, duck, lion, wolf);
        for (Swim animal : lake) {
            animal.swim();
        }
        List<Run> earth = Arrays.asList(duck, otter, lion, wolf);
        for (Run animal : earth) {
            animal.run();
        }
        List<Fly> sky = Arrays.asList(duck);
        for (Fly animal : sky) {
            animal.fly();
        }

        worker.feed(duck, grass);
        worker.feed(duck, meat);
        otter.swim();
        worker.getVoice(duck);
        worker.getVoice(otter);
        duck.swim();
        duck.run();
        duck.fly();
        worker.feed(fish, grass);
        worker.feed(fish, meat);
        fish.swim();
        worker.feed(otter, meat);
        worker.feed(otter, grass);
        worker.feed(lion, meat);
        worker.feed(lion, grass);
        worker.getVoice(lion);
        worker.feed(lion, meat);
        lion.run();
        worker.feed(wolf, grass);
        worker.getVoice(wolf);
        worker.feed(wolf, meat);
        wolf.run();
    }


}
