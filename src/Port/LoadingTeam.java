package Port;
// класс, представляющий команду грузчиков
public class LoadingTeam extends Thread{
    private String name;
    private Dock dock;// привязка команды к конкретной пристани

    public LoadingTeam(String name, Dock dock) {
        this.name = name;
        this.dock = dock;
    }
    // переопределенный метод run () для выполнения работы грузчиков

    @Override
    public void run() {
        while (true){
            try {
                // получаем следующий корабль для загрузки из порта
                Ship ship=Port.getNextShip();
                if (ship == null) {
                    // Если getNextShip возвращает null, выходим из цикла
                    break;
                }
                System.out.println(name + " is loading " + ship.getName());
                // имитация времени загрузки
                Thread.sleep(5000);
                System.out.println(name + " finished loading" + ship.getName());
                // отшвартовываем корабль после загрузки
                dock.undockShip(ship);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
