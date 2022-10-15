package inheritance;

public class Plane extends Aircraft {
    public Plane(int passengersAmount, int load, String petrol, int maxSpeed, int flightAltitude) {
        super(passengersAmount, load, petrol, maxSpeed, flightAltitude);
    }

    @Override
    protected void go() {
        super.go();
        System.out.println("by plane");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "flightAltitude=" + flightAltitude +
                ", passengersAmount=" + passengersAmount +
                ", load=" + load +
                ", petrol='" + petrol + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
