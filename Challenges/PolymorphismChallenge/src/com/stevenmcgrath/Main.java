package com.stevenmcgrath;

// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

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
