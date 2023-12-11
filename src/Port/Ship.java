package Port;

public class Ship {
    // Класс, представляющий корабль в порту
    private String name;

    // Конструктор для создания корабля с указанным именем
    public Ship(String name) {
        this.name = name;
    }
    // Метод для получения имени корабля
    public String getName(){
        return name;
    }
// метод для изменения/присвоения имени корабля
    public void setName(String name) {
        this.name = name;
    }
}
