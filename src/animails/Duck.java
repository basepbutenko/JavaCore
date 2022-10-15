package animails;

public class Duck extends Animal implements Flyable, Walkable{ // implements (ключевое слово) - реализует
    @Override
    public void say() {// option enter нажать имплементировать
        System.out.println("DUCKS WALKS");

    }

    @Override
    public void fly() {
        System.out.println("DUCKS IS FLY, WALKS AND Swimmables");

    }

    @Override
    public void walk() {
        System.out.println("DUCKS IS FLY, WALKS AND Swimmables");
    }
}
