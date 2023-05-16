public class PoorDog {
    private int size;
    private String name;

    public PoorDog() {
    }

    public int getSize() {
        return size = 50;
    }

    public String getName() {
        return name = "Nika";
    }

    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.print ("Размер собаки -" + one.getSize());
        System.out.println(" Имя собаки -" + one.getName());
    }
}

