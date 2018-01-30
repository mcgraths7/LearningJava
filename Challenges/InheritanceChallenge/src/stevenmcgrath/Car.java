package stevenmcgrath;

public class Car extends Vehicle {
    private int wheels;
    private int windows;
    private String bodyType;
    private int currentGear;

    public Car(int numberOfDoors, String engineType, String methodOfMovement, int wheels, int windows, String bodyType, int currentGear) {
        super(numberOfDoors, engineType, methodOfMovement);
        this.wheels = wheels;
        this.windows = windows;
        this.bodyType = bodyType;
        this.currentGear = currentGear;
    }

    public void turnKey(){
        System.out.println("Turned the key in the ignition.");
        start();
    }
    public void shiftUp(){
        currentGear += 1;
        System.out.println("Shifted up one gear");
    }
    public void shiftDown(){
        currentGear -= 1;
        System.out.println("Shifted down one gear");
    }
    public void applyGas(){
        accelerate(5);
        System.out.println("Accelerated by 5");
    }
    public void applyBrake(){
        brake(5);
        System.out.println("Decelerated by 5");
    }
    public void turnWheelLeft(){
        turn("left");
    }
    public void turnWheelRight(){
        turn("right");
    }

}
