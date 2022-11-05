package patterns;

import patterns.singleton.Singleton;

public class PaternsDemo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("1");

        System.out.println(singleton.value + " " + singleton.hashCode());

        Singleton singleton1 = Singleton.getInstance("2");

        System.out.println(singleton1.value + " " + singleton1.hashCode());

        Singleton.reset();

        Singleton singleton2 = Singleton.getInstance("3");

        System.out.println("singleton2.value : " + singleton2.value + " " + singleton2.hashCode());
    }

}
