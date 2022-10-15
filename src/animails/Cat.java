package animails;

public class Cat extends Animal implements Walkable{
    @Override
    public void say() {// option enter нажать имплементировать

    } //наследовать extends от анимал

    @Override
    public void walk() {
        System.out.println("CAT WALKS");

    }
}
