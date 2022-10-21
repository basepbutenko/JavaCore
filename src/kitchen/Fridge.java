package kitchen;

public class Fridge extends ElectricAppliance implements Openable,Lucent {
    // композиция
    private Counter counter;

    /*
    D  - принцип инверсии зависимостей
    Зависимость на Абстракциях. Нет зависимости на что-то конкретное
    * */
    public Fridge(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void open() {
        System.out.println("fridge : open");

    }

    @Override
    public void light() {
        System.out.println("fridge : light");
    }
}
