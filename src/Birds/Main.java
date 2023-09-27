package Birds;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Bird("Sparrow", 10.0);
        Bird eagle = new Bird("Eagle", 100.0);
        Bird parrot = new Bird("Parrot", 20.0);
        Bird[] c = {sparrow, eagle, parrot};
        for (Bird tmp : c) {
            tmp.price = tmp.price + 1000;
        }
        for (Bird tmp : c) {
            System.out.println(tmp.name + "->" + tmp.price);
//            System.out.println("Original birds:");
//            System.out.println(sparrow.getName() + " - $" + sparrow.getPrice());
//            System.out.println(eagle.getName() + " - $" + eagle.getPrice());
//            System.out.println(parrot.getName() + " - $" + parrot.getPrice());


        }
    }
}