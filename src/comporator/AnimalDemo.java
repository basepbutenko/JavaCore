package comporator;

import java.util.Arrays;
import java.util.Comparator;

public class AnimalDemo  {
    public static void main(String[] args) {
        Animal dog=new Animal(50,"Nika","Rotveller", 2000);
        Animal dog1=new Animal(30, "Afina", "Ovcharka", 5000);
        Animal cat =new Animal(5, "Myrik", "Withbreed", 1000);

        Animal[] a={dog, dog1, cat};
        Arrays.sort(a);

        for (Animal tmp:a){
            System.out.println(tmp);
        }
    }
}
