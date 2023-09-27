package Courses;

import java.util.ArrayList;

public class SimpleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(al.size());
        al.add(1);
        System.out.println(al.size());

        for (int i = 0; i < 10; i++) {
            al.add(i);
            System.out.print(al.get(i)+" ");

        }
        System.out.println("\n" + al.size());
        for (int i = 0; i < 5; i++) {
            al.remove(0);

        }
        for (Integer integer : al) {
            System.out.print(integer+" ");

        }
        System.out.println("\n" + al.size());
    }
}
