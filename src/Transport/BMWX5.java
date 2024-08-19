package Transport;

public class BMWX5 extends Car {
    private int maxSpeed;

    public BMWX5(String move, int Speed, int numberOfWheels, String name, int maxSpeed){
        this.move = move;
        this.speed = speed;
        this.numberOfWheels = numberOfWheels;
        this.name=name;
        this.maxSpeed=maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int sumOfDistance(){
        return 10+5;

    }
}
