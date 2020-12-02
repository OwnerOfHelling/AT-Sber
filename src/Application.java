import model.Kotik;
import java.io.*;
import java.util.ArrayList;

public class Application {

  public static void main(String[] args) {
    Kotik vasya = new Kotik("Вася", "мурмур", "рыжий", 4, 5, 5);

    Kotik petia = new Kotik();

    petia.setKotik("Петя", "мурмур", "серый", 2, 8, 5);

    System.out.println(vasya.getName() + " мяукает - " + vasya.getMeow() + ", цвет - " + vasya.getColor() + ", возраст - " + vasya.getAge() + " года, вес - " + vasya.getWeight() + " килограмм");

    vasya.liveAnotherDay();

    System.out.println(vasya.getName() + " " + vasya.getAge() + " года");

    System.out.println(vasya.getMeow().equals(petia.getMeow()) ? "Мяукают одинаково" : "Мяукают по разному");

    System.out.println(Kotik.catsQuantity);

  }
}

