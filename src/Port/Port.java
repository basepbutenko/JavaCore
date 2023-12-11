package Port;
// класс, представляющий порт
public class Port {
    private static final int NUM_SHIPS=10;
    private static final int NUM_DOCKS=5;

    private static Ship [] ships=new Ship[NUM_SHIPS];
    private static Dock [] docks=new Dock[NUM_DOCKS];

    // инициализация кораблей и пристаней при запуске программы
static {
    for (int i = 0; i<NUM_SHIPS;i++){
        ships [i] =new Ship("Ship "+(i+1));
    }
    for (int i = 0; i<NUM_DOCKS;i++){
        docks[i]=new Dock(1);
    }
    }
// метод для получения следующего коабля из порта для загрузки
//public static Ship getNextShip (){
//    for (Ship ship : ships) {
//        try {
//            if (ship != null) {
//                System.out.println("Port is waiting for a dock for " + ship.getName());
//                // получаем доступное парковочное место
//                int dockIndex = getAvailableDock();
//                // пришвартовываем корабль
//                docks[dockIndex].dockShip(ship);
//            }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
public static Ship getNextShip (){
    for (Ship ship:ships){
        if (ship!=null){
            ships[getIndex(ship)]=null;
            return ship;
        }
    }
    return null;
}
//метод для получения индекса корабля в массиве
    private static int getIndex(Ship ship){
    for (int i=0; i< ships.length;i++ ){
        if (ships [i] ==ship){
            return i;
        }
    }
return -1;
    }
// метод для получения доступной пристани (семафора)
private static int getAvailableDock() throws InterruptedException {
    for (int i = 0; i < docks.length; i++) {
        try {
            if (docks[i].dockShip(null)) {
                return i;
            }
        } catch (InterruptedException e) {
            // Обработка исключения, если необходимо
            throw new RuntimeException(e);
        }
    }
    // если нет доступных пристаней, спим и пробуем снова
    Thread.sleep(1000);
    return getAvailableDock();
}
//private static int getAvailableDock()throws InterruptedException{
//    for (int i = 0; i< docks.length;i++){
//        if(docks[i].parkingSpots.AvailablePermits()>0){
//            return i;
//        }
//    }
//    // если нет доступных пристаней, спим и пробуем снова
//    Thread.sleep(1000);
//    return getAvailableDock();
//}
// метод для выполнения симуляции порта
    public void runPortSimulation(){
    LoadingTeam team1=new LoadingTeam("Team1 ",docks[0]);
    LoadingTeam team2=new LoadingTeam("Team2 ",docks[1]);
    LoadingTeam team3=new LoadingTeam("Team3 ",docks[2]);
    team1.start();
    team2.start();
    team3.start();

    //имитация прихода кораблей в порт
        for (Ship ship:ships){
            try {
                System.out.println("Port is waiting for a dock for" + ship.getName());
                if (ship == null) {
                    // Если getNextShip возвращает null, выходим из цикла
                    break;
                }
                //получаем доступное парковочное место
                int dockIndex =getAvailableDock();
                //пришвартовываем корабль
                docks[dockIndex].dockShip(ship);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
