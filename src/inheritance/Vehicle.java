package inheritance;

import java.util.Objects;

//транспортное средсво
public class Vehicle {
    protected int passengersAmount;
    protected int load;
    protected String petrol;

    protected int maxSpeed;

    public Vehicle(int passengersAmount, int load, String petrol, int maxSpeed) {
        this.passengersAmount = passengersAmount;
        this.load = load;
        this.petrol = petrol;
        this.maxSpeed = maxSpeed;
    }

    protected void go(){
        System.out.println("GO!");
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }

    public void setPassengersAmount(int passengersAmount) {
        this.passengersAmount = passengersAmount;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public String getPetrol() {
        return petrol;
    }

    public void setPetrol(String petrol) {
        this.petrol = petrol;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return passengersAmount == vehicle.passengersAmount && load == vehicle.load && maxSpeed == vehicle.maxSpeed && Objects.equals(petrol, vehicle.petrol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passengersAmount, load, petrol, maxSpeed);
    }
}
