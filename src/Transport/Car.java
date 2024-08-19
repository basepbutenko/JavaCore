package Transport;

public abstract class Car  {
public Car(String move, int speed, int numberOfWheels, String name){
    this.move = move;
    this.speed = speed;
    this.numberOfWheels = numberOfWheels;
    this.name=name;
}
public String move="I can drive";
    public int speed = 160;
    public int numberOfWheels=4;
    public String name = "AUDI";

    public Car(){

    }
}


