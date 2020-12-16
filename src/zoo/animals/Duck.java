package zoo.animals;


public class Duck extends Herbivore implements Fly, Run, Swim, Voice {

    public Duck() {
        super("Селезень", 3);
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println(getName() + " улетает.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плывет к берегу.");
    }

    @Override
    public void run() {
        System.out.println(getName() + " берет разгон.");
    }

    @Override
    public void voice() {
        System.out.println(getName() + " кря-кря на выдру");
    }

}
