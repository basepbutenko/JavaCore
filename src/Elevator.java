public class Elevator {

    public static final String ELEVATOR_MANUFACTURER = "Samsung"; // статическая переменная

    public static String getElevatorManufacturer(){ // статический метод
        return ELEVATOR_MANUFACTURER;
    }

    private boolean isDoorOpen = false;
    private int currentFloor = 1;


    public final int maxFloors;
    public final int MIN_FLOORS = 1;

    private Elevator(int maxFloors) {
        this.maxFloors = maxFloors;
    }

    public Elevator(boolean isDoorOpen, int currentFloor, int maxflrs) {
        this.isDoorOpen = isDoorOpen;
        this.currentFloor = currentFloor;
        maxFloors = maxflrs;
    }

    public void openDoor() {
        if (isDoorOpen) {
            System.out.println("Door is open already!");
            return;
        }
        System.out.println("Opening door.");
        isDoorOpen = true;
        System.out.println("Door is open.");
    }

    public void closeDoor() {
        if (!isDoorOpen) {
            System.out.println("Door is closed already!");
            return;
        }
        System.out.println("Closing door.");
        isDoorOpen = false;
        System.out.println("Door is closed.");
    }

    public void goUp() {
        if (currentFloor == maxFloors) {
            System.out.println("Cannot go up");
        }
        if (currentFloor < maxFloors) {
            System.out.println("Going up one floor.");
            currentFloor++;
            System.out.println("Floor:" + currentFloor);
        }
    }

    public void goDown() {
        if (currentFloor == MIN_FLOORS) {
            System.out.println("Cannot go down.");
        }
        if (currentFloor > MIN_FLOORS) {
            System.out.println("Going down one floor.");
            currentFloor--;
            System.out.println("Floor:" + currentFloor);
        }
    }

    public void setFloor(int desiredFloor) {
        if (desiredFloor > maxFloors || desiredFloor < MIN_FLOORS) {
            System.out.println("No such Floor");
            return;
        }
        closeDoor();
        while (currentFloor != desiredFloor) {
            if (currentFloor < desiredFloor) {
                goUp();
            } else {
                goDown();
            }
        }
        openDoor();
    }


    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
