package inheritance;

public class Train extends LandVehicle {
    public Train(int passengersAmount, int load, String petrol, int maxSpeed, String roadType) {
        super(passengersAmount, load, petrol, maxSpeed, roadType);
    }

    @Override
    protected void go() {
        super.go();
        System.out.println("by train");
    }

    @Override
    public String toString() {
        return "Train{" +
                "roadType='" + roadType + '\'' +
                ", passengersAmount=" + passengersAmount +
                ", load=" + load +
                ", petrol='" + petrol + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
