package zoo.animals;

import java.util.HashMap;

public class Aviary<T extends Animal> {
    private int limit;
    public HashMap<String, T> aviary = new HashMap<>();

    public Aviary(int limit) {
        this.limit = limit;
    }

    public void addAnimal(T animal) {
        if (limit > aviary.size()) {
            aviary.put(animal.getName(), animal);
            System.out.println(animal.getClass().getSimpleName() + " в вальере сейчас = " + aviary.size() + " животных");
        } else if (limit <= aviary.size()) {
            System.out.println("В вальере больше нет мест");
        }
    }

    public void deleteAnimal(String name) {
        if (aviary.containsKey(name)) {
            aviary.remove(name);
            System.out.println(name + " вышел из вальера");
        } else {
            System.out.println("Животного с именем " + name + " нет в вальере");
        }
    }

    public void getAnimal(String name) {
        if (aviary.containsKey(name)) {
            System.out.println("Это " + name);
        } else {
            System.out.println("Животного с именем " + name + " нет в вальере");
        }
    }
}
