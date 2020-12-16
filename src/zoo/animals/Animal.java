package zoo.animals;

import zoo.food.Food;


import java.util.Objects;

public abstract class Animal {

    public String name;
    public int satiety;


    public Animal(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    protected abstract boolean foodAccepted(Food food);

    public void eat(Food food) throws WrongFoodException {
        if (satiety < 4) {
            System.out.println(name + " ест " + food + ", сытость увеличилась на " + (satiety++));
        } else throw new WrongFoodException(name + " не ест " + food);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static class WrongFoodException extends Exception {

        public WrongFoodException(String message) {
            super(message);
        }
    }
}
