package kitchen;

public class Camera extends ElectricAppliance implements Lucent{//extends - наследует, implements - реализует
    @Override//option+enter на слове Lucent=выполняется переопределить, появляется @Override
    public void light() {
        System.out.println("camera : light");
    }
}
