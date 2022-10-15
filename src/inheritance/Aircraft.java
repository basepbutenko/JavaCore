package inheritance;

import inheritance.Vehicle;

public class Aircraft extends Vehicle {
    int flightAltitude;

    public Aircraft(int passengersAmount, int load, String petrol, int maxSpeed, int flightAltitude) {
        super(passengersAmount, load, petrol, maxSpeed);
        this.flightAltitude = flightAltitude;
    }

    @Override
    protected void go() {
        super.go();
        System.out.println("in the air");
    }
}
