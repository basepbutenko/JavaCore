package animails;

import java.util.ArrayList;

public class AnimalsDemo {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal crocodile = new Crocodile();
        Animal dolphin = new Dolphin ();
        Animal duck = new Duck();
        Animal eagle = new Eagle();
        ArrayList<Animal> animals=new ArrayList<>();
        animals.add(cat);
        animals.add(crocodile);
        animals.add(dolphin);
        animals.add(duck);
        animals.add(eagle);


        for (Animal item: animals) {
            if (item instanceof Flyable) {
                ((Flyable) item).fly();
            }

            if (item instanceof Swimmable) {
                ((Swimmable) item).swim();
            }

            if (item instanceof Walkable) {
                ((Walkable) item).walk();
            }
        }

    }
}
