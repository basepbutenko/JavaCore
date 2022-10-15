package inheritance;

import java.util.Objects;

public class LandVehicle extends Vehicle {

    String roadType;

    public LandVehicle(int passengersAmount, int load, String petrol, int maxSpeed, String roadType) {
        super(passengersAmount, load, petrol, maxSpeed);
        this.roadType = roadType;
    }

    @Override
    protected void go() {
        super.go();
        System.out.println("By land");
    }

    @Override
    public String toString() {
        return "{" +
                "roadType='" + roadType + '\'' +
                ", passengersAmount=" + passengersAmount +
                ", load=" + load +
                ", petrol='" + petrol + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LandVehicle that = (LandVehicle) o;

        return Objects.equals(roadType, that.roadType);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (roadType != null ? roadType.hashCode() : 0);
        return result;
    }
}
