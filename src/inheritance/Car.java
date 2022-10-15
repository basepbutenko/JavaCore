package inheritance;

import movable.Movable;

public class Car extends LandVehicle implements Movable {

    public Car(int passengersAmount, int load, String petrol, int maxSpeed, String roadType) {
        super(passengersAmount, load, petrol, maxSpeed, roadType);
    }

    @Override
    protected void go() {
        super.go();
        System.out.println("in a car");
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "Car {" +
                "roadType='" + roadType + '\'' +
                ", passengersAmount=" + passengersAmount +
                ", load=" + load +
                ", petrol='" + petrol + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}
