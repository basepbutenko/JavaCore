package kitchen;

public class Camera extends ElectricAppliance implements Lucent{//extends - наследует, implements - реализует
    private Counter counter;

    public Camera(Counter counter) {
        this.counter = counter;
    }

    @Override//option+enter на слове Lucent=выполняется переопределить, появляется @Override
    public void light() {
        counter.increment();
        System.out.println("camera : light");
    }
}
