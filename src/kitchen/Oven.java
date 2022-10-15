package kitchen;

public class Oven extends ElectricAppliance implements Cooker, Openable{
    @Override
    public void cook() {
        System.out.println("Oven : cook");
    }

    @Override
    public void open() {

    }
}
