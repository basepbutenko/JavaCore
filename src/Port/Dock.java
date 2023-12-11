package Port;

import java.util.concurrent.Semaphore;

public class Dock {
    private final Semaphore parkingSpots; // семафор для управления парковочными местами

    // конструктор для создания пристани с указанием парковочных мест
    public Dock(int numberOfSpots) {
        parkingSpots = new Semaphore(numberOfSpots, true);
    }
    // метод для пришвартовки корабля к пристани
    public boolean dockShip (Ship ship) throws InterruptedException {
        System.out.println(ship.getName() + "is requesting to dock");

        //ожидание, пока будет свободное парковочное место
        parkingSpots.acquire();
        System.out.println(ship.getName() + "has docked.");
        return true;
    }
        // метод для отшвартовки корабля от пристани
        public void undockShip(Ship ship){
            System.out.println(ship.getName() + " is undocking.");
            parkingSpots.release();

        }
    }

