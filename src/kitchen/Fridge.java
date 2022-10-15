package kitchen;

public class Fridge extends ElectricAppliance implements Openable,Lucent {
    @Override
    public void open() {
        System.out.println("fridge : open");

    }

    @Override
    public void light() {
        System.out.println("fridge : light");
    }
}
