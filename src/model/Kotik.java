package model;

public class Kotik {
  private String name;
  private String meow;
  private String color;
  private int age;
  private int weight;
  private int satiety;
  public static int catsQuantity = 0;


  private boolean runs() {
    return action("Убежал в закат");
  }

  private boolean play() {
    return action("Играет с хвостом");
  }

  private boolean meows() {
    return action("Орет во всю глотку");
  }

  private boolean sleep() {
    return action("Выбился из сил, уснул");
  }

  private boolean chaseMouse() {
    return action("Пытается поймать мышь");
  }

  public Kotik(String name, String meow, String color, int age, int weight, int satiety) {
    setKotik(name, meow, color, age, weight, satiety);
    catsQuantity++;
  }

  public Kotik() {
    catsQuantity++;
  }

  public void setKotik(String name, String meow, String color, int age, int weight, int satiety) {
    this.name = name;
    this.meow = meow;
    this.color = color;
    this.age = age;
    this.weight = weight;
    this.satiety = satiety;
  }

  public String getName() {
    return name;
  }

  public String getColor(){
    return color;
  }

  public int getAge() {
    return age;
  }

  public int getSatiety() {
    return satiety;
  }

  public int getWeight() {
    return weight;
  }

  public String getMeow() {
    return meow;
  }

  public void liveAnotherDay() {
    for (int i = 0; i < 24; i++) {
      int result = (int) Math.round(Math.random() * 3);
      boolean catDidAction = false;
      switch (result) {
        case 0:
          catDidAction = runs();
          satiety--;
          break;
        case 1:
          catDidAction = play();
          satiety--;
          break;
        case 2:
          catDidAction = meows();
          satiety--;
          break;
        case 3:
          catDidAction = sleep();
          satiety--;
          break;
        case 4:
          catDidAction = chaseMouse();
          satiety++;
          break;
        default:
          break;
      }
      if (!catDidAction) eat();
    }
  }

  void eat(int addSatiety) {
    satiety += addSatiety;
  }

  void eat(int addSatiety, String food) {
    eat(addSatiety);
  }

  void eat() {
    eat(5, "Вискас");
    say(getName() + " поел");
  }

  private void say(String inputMsg) {
    System.out.println(inputMsg);
  }

  private boolean action(String msg) {
    if (satiety <= 0) {
      say(getName() + " голоден нужно поесть");
      return false;
    }
    say(getName() + ": " + msg);
    return true;
  }

}
