package kitchen;

public class CoffeMaker extends ElectricAppliance implements Cooker, Openable{
    @Override
    public void cook() {
        System.out.println("CoffeMaker : cook");

    }

    @Override
    public void open() {
        System.out.println("CoffeMaker : open");

    }
}
