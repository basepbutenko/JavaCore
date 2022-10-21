package kitchen;

import java.util.ArrayList;

public class KitchenDemo {
    public static void main(String[] args) {

        Counter counter = new CounterImpl();
        Camera camera = new Camera(counter);

        Fridge fridge = new Fridge(new CounterImpl());

        CoffeMaker coffeMaker = new CoffeMaker();
        MicroWaveOven microWaveOven = new MicroWaveOven();
        Oven oven = new Oven();

        ArrayList<ElectricAppliance> electricAppliances = new ArrayList<>();
        electricAppliances.add(camera);
        electricAppliances.add(fridge);
        electricAppliances.add(coffeMaker);
        electricAppliances.add(oven);
        electricAppliances.add(microWaveOven);

        ArrayList<Lucent> lucents = new ArrayList<>();
        for (ElectricAppliance electricAppliance : electricAppliances) {
            if (electricAppliance instanceof Lucent) {
                lucents.add((Lucent) electricAppliance);
            }

            if (electricAppliance instanceof Openable) {
                ((Openable) electricAppliance).open();
            }
            if (electricAppliance instanceof Cooker) {
                ((Cooker) electricAppliance).cook();
            }
        }


        for (Lucent lucent : lucents) {
            lucent.light();
        }

        User user = new User(camera);
        user.doWork(fridge);
        camera.light();

    }

}
