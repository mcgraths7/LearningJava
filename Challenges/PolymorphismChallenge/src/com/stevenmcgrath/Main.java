package com.stevenmcgrath;

class Car {
  private int cylinders;
  private int wheels;
  private boolean engine;
  private String name;

  public Car(int cylinders, String name) {
    this.cylinders = cylinders;
    this.name = name;
    this.engine = true;
    this.wheels = 4;
  }

  public int getCylinders() {
    return cylinders;
  }

  public String getName() {
    return name;
  }

  public void startEngine() {
    System.out.println("The engine is started.");
  }
  public void accelerate() {
    System.out.println("You are now going faster.");
  }
  public void brake() {
    System.out.println("You have slowed down.");
  }
}

class Porsche extends Car {
  public Porsche(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public void startEngine() {
    System.out.println("The engine roars to life.");
  }

  @Override
  public void accelerate() {
    System.out.println("You speed up, passing a nearby prius.");
  }

  @Override
  public void brake() {
    System.out.println("You lurch to a stop.");
  }
}
class Ferrari extends Car {
  public Ferrari(int cylinders, String name) {
    super(cylinders, name);
  }

  @Override
  public void startEngine() {
    System.out.println("You awaken the sleeping beast.");
  }

  @Override
  public void accelerate() {
    System.out.println("As you accelerate, the panties of nearby women fly off.");
  }

  @Override
  public void brake() {
    System.out.println("Your stomach flies out of your mouth as you come to a halt.");
  }
}
class Toyota extends Car {
  public Toyota(int cylinders, String name) {
    super(cylinders, name);
  }
}

public class Main {
  public static void main(String[] args) {
    Toyota toyota = new Toyota(4, "Camry");
    Porsche porsche = new Porsche(6, "911");
    Ferrari ferrari = new Ferrari(12, "488");

    toyota.startEngine();
    toyota.accelerate();
    toyota.brake();

    porsche.startEngine();
    porsche.accelerate();
    porsche.brake();

    ferrari.startEngine();
    ferrari.accelerate();
    ferrari.brake();
  }
}
