package zoo.food;

import java.util.Objects;

public abstract class Food {
    protected String typeFood;
    protected int increaseSatiety;

    public Food(String typeFood, int increaseSatiety) {
        this.typeFood = typeFood;
        this.increaseSatiety = increaseSatiety;
    }

    public String TypeFood() {
        return typeFood;
    }

    @Override
    public String toString() {
        return typeFood;
    }

}
