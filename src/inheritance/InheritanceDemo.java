package inheritance;

import inheritance.*;

import java.util.ArrayList;

class InheritanceDemo {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        LandVehicle landVehicle = new Train(300, 100, "Electrical", 150, "railway");
        LandVehicle car = new Car(5, 1, "Gasoline", 150, "road");
        Vehicle aircraft = new Plane(5, 1, "Gasoline", 1000, 6000);

        Vehicle ship = new Ship(6000, 10000000, "Gasoline", 100);
        Vehicle ship1 = new Ship(6000, 10000000, "Gasoline", 100);

        System.out.println(ship == ship1); // 1 false
        System.out.println(ship.equals(ship1)); // 2 true



        Vehicle land1 = new Train(6000, 10000000, "Gasoline", 100, "railway");
        Vehicle land2 = new Car(6000, 10000000, "Gasoline", 100, "road");


        System.out.println(land1.hashCode()); // 2 false
        System.out.println(land2.hashCode()); // 2 false

        System.out.println(land1.getClass()); // 2 false
        System.out.println(land2.getClass()); // 2 false


        System.out.println(land1.equals(land2)); // 2 false

        Vehicle someVehicle = null;
        someVehicle = car;

        vehicles.add(landVehicle);
        vehicles.add(car);
        vehicles.add(aircraft);
        vehicles.add(ship);

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
            System.out.println("_______");
        }


        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        System.out.println("_______");

        for (Vehicle vehicle : vehicles) {
            if(vehicle instanceof LandVehicle){
                System.out.println(vehicle);
            }
        }

        System.out.println("_______");



    }
}


