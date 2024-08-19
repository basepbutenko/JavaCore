package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> al = new ArrayList<>();
        al.add(new Car(2000, "Audi"));
        al.add(new Car(3000, "Audi A6"));
        al.add(new Car(2000, "Audi A8"));
        al.add(new Car(2000, "Audi Q7"));
        System.out.println(al);

        Iterator<Car> myIterator = al.iterator();
        while (myIterator.hasNext()) {
            Car tmp = myIterator.next();
            tmp.price *= 2;
            tmp.name += " " + "Quatro";
        }
        System.out.println(al);

    }
}
