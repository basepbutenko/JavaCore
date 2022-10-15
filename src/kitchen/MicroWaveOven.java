package kitchen;

public class MicroWaveOven extends Oven {
    @Override
    public void cook() {
        System.out.println("MicroWaveOven : cook");

    }

    @Override
    public void open() {
        System.out.println("MicroWaveOven : open");
    }
}
