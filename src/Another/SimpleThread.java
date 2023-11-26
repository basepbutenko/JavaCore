package Another;

import java.util.ArrayList;

public class SimpleThread extends Thread {
    public static void main(String[] args) {
        // для того, чтобы увидеть название потока, берем SOPL в метод Another.Main
        System.out.println(Thread.currentThread().getName());
        // для создания потока нам необходимо обратиться к классу Course4.Course4.Course4.Thread
        Thread t = new Thread(new SimpleThread());
        // далее по ссылке t вызываем метод старт
        t.start();
        // после наследования класса Course4.Course4.Course4.Thread нужно переопределить метод Run, нажав ctrl+O или command+N

        // создаем объекты, чтобы посмотреть как работает метод Run
        ArrayList al = new ArrayList();
        for (int i = 0; i < 100001; i++) {
            al.add(new Object());

        }
        System.out.println("HELLO");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);// в этом случае мы узнаем имя текущего потока
            
        }
       // super.run(); это метод родителя, мы его не используем, вместо него используем цикл for нажав fori
        // на єкран виводим сообщение 10 раз
        // далее нам необходимо создать экземпляр описанного класса Another.SimpleThread и передать в конструктор Course4.Course4.Course4.Thread
    }
}
