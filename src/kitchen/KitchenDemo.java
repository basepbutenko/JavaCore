package kitchen;

import java.util.ArrayList;

public class KitchenDemo {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Fridge fridge = new Fridge();
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


    }

}
