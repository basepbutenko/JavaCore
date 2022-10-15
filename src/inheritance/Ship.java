package inheritance;

public class Ship extends SeaVehicle {
    public Ship(int passengersAmount, int load, String petrol, int maxSpeed) {
        super(passengersAmount, load, petrol, maxSpeed);
    }

    @Override
    protected void go() {
        super.go();
        System.out.println("by the ship");
    }

    @Override
    public String toString() {
        return "Ship (Корабль){" +
                "passengersAmount=" + passengersAmount +
                ", load=" + load +
                ", petrol='" + petrol + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
