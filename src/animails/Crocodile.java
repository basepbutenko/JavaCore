package animails;

public class Crocodile extends Animal implements Swimmable, Walkable{
    @Override
    public void say() {// option enter нажать имплементировать

    }

    @Override
    public void swim() {
        System.out.println("CROCODILE SWIMS");

    }

    @Override
    public void walk() {
        System.out.println("CROCODILE WALKS");
    }
}
