package zoo.animals;


import zoo.food.Food;

public class Otter extends Carnivorous implements Run, Swim, Voice{

    public Otter(){
        super("Выдра", 3);
    }

    public String getName(){
        return name;
    }

    @Override
    public void run() {
        System.out.println(getName() + " бегает по берегу.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плавает вокруг селезьня.");
    }

    @Override
    public void voice() {
        System.out.println(getName() + " делает фыр-фыр");
    }

}
