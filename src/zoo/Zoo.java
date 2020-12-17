package zoo;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import zoo.animals.*;
import zoo.food.Grass;
import zoo.food.Meat;

import java.util.HashMap;
import java.util.Map;

public class Zoo {

    static final Logger LOG = LogManager.getLogger(Zoo.class.getName());

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

        Aviary<Herbivore> herbivoreAviary = new Aviary<>(2);
        Aviary<Carnivorous> carnivorousAviary = new Aviary<>(2);

        herbivoreAviary.addAnimal(duck);
        herbivoreAviary.addAnimal(fish);
        carnivorousAviary.addAnimal(lion);
        carnivorousAviary.addAnimal(wolf);
        carnivorousAviary.addAnimal(otter);
        carnivorousAviary.deleteAnimal("Акелла");
        carnivorousAviary.getAnimal("Выдра");
        herbivoreAviary.getAnimal("Карась");


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
        lion.run();
        worker.feed(wolf, grass);
        worker.getVoice(wolf);
        worker.feed(wolf, meat);
        wolf.run();

        LOG.atLevel(Level.ERROR);

    }


}
