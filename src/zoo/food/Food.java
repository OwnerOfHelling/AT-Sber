package zoo.food;

public abstract class Food {
    protected String typeFood;
    protected int increaseSatiety;

    public Food(String typeFood, int increaseSatiety){
        this.typeFood = typeFood;
        this.increaseSatiety = increaseSatiety;
    }



}
