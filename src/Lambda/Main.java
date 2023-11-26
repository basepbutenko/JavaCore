package Lambda;
/* 1 создаем функциональный интерфейс User with void method print
2 создаем объект User
*/
public class Main {
    public static void main(String[] args) {
        long l1 = System.nanoTime();
        User user1 = new User() {
            @Override
            public void print() {
                System.out.println("Hello");

            }
        };
        user1.print(); // Вызывает метод print() для объекта user1
        long l2 = System.nanoTime();
        long l3 = System.nanoTime();
    User user2 = ( )-> System.out.println("Hello Aleks Developer");
        user2.print();
        long l4 = System.nanoTime();
        System.out.println("Time with Anonimus class");
        System.out.println( l2-l1);
        System.out.println("Time With Lambda");
        System.out.println(l4 - l3);
        System.out.println("-------------------------");
    }
}

interface User{
    void print();
}

