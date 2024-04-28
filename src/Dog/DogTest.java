package Dog;

public class DogTest {

    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println("Dog weight is "  + d.getWeight());
        d.setWeight (42);
        System.out.println("Dog weight is "  + d.getWeight());
        d.setWeight(50);
        System.out.println("Dog weight is " + d.getWeight());
    }
}
