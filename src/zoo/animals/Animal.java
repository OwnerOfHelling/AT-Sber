package zoo.animals;

public class Animal {

    protected String name;
    protected String species;
    protected boolean run;
    protected boolean swim;
    protected boolean fly;
    protected String voice;
    protected int satiety;

    public Animal(String name, String species, boolean run, boolean swim, boolean fly, String voice, int satiety){
        this.name = name;
        this.species = species;
        this.run = run;
        this.swim = swim;
        this.fly = fly;
        this.voice = voice;
        this.satiety = satiety;
    }

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", run=" + run +
                ", swim=" + swim +
                ", fly=" + fly +
                ", voice='" + voice + '\'' +
                ", satiety=" + satiety +
                '}';
    }
}
