public class ElectricGuitarDemo {
    public static void main(String[] args) {
        ElectricGuitar guitar = new ElectricGuitar();// вызов конструктора, создание объекта
        //guitar.setBrand("aaaaa");
        System.out.println(guitar.brand);
        guitar.setBrand("aaaaa");
        guitar.setNumofPickups(1);
        System.out.println(guitar.getNum0fPickups());
        guitar.brand = "bbb";//
        System.out.println(guitar.getBrand());
        guitar.setNumofPickups(4);//numOfPickups = 4;
        System.out.println(guitar.getNum0fPickups());
        String brand = guitar.getBrand();
        System.out.println("br..." + brand);
    }
}
