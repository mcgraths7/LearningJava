package stevenmcgrath;

public class Vehicle {
    private int numberOfDoors;
    private String engineType;
    private String methodOfMovement;

    public Vehicle(int numberOfDoors, String engineType, String methodOfMovement) {
        this.numberOfDoors = numberOfDoors;
        this.engineType = engineType;
        this.methodOfMovement = methodOfMovement;
    }

    public void move(){
        System.out.println("Vehicle.move() called");
    }
    public void start(){
        System.out.println("Started the engine");
    }
    public void stop(){
        System.out.println("Stopped the engine");
    }
    public void turn(String direction){
        System.out.printf("Turned %s", direction);
    }
    public void accelerate(int speed){
        System.out.printf("Sped up by %d", speed);
    }
    public void brake(int speed){
        System.out.printf("Slowed down by %d", speed);
    }
}
