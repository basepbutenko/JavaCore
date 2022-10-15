
package inheritance;

public class SeaVehicle extends Vehicle {

    public SeaVehicle(int passengersAmount, int load, String petrol, int maxSpeed) {
        super(passengersAmount, load, petrol, maxSpeed);
    }

    @Override
    protected void go() {
        super.go();
        System.out.println("by sea");
    }
}
