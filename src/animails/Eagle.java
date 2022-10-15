package animails;

public class Eagle extends Animal implements Flyable, Walkable{
    @Override
    public void fly() {
        System.out.println("EAGLE WALKS AND FLY");
    }

    @Override
    public void say() {// option enter нажать имплементировать
        System.out.println("cat wALKS");

    }

    @Override
    public void walk() {

    }
}
