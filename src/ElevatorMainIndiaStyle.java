import java.util.Scanner;

public class ElevatorMainIndiaStyle {

    public static final int COMMAND_UP = 1;
    public static final int COMMAND_DOWN = 2;
    public static final int COMMAND_OPEN = 3;
    public static final int COMMAND_CLOSE = 4;
    public static final int COMMAND_SETFLOOR = 5;

    public static boolean isDoorOpen = false;//двери лифта по умолчанию закрыты
    static int currentFloor = 1;
    public static final int MAX_FLOORS = 10;
    public static final int MIN_FLOORS = 1;


    public static void main(String[] args) {
        System.out.println(" введите command ");
        System.out.println(" enter 1 to go up ");
        System.out.println(" enter 2 to go down ");
        System.out.println(" enter 3 to open the door ");
        System.out.println(" enter 4 to close the door ");
        System.out.println("enter 5 to set floor");


        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int command = -1;

        while (command != 0) {

            command = keyboard.nextInt();
            switch (command) {
                case COMMAND_UP:
                    goUp();
                    break;
                case COMMAND_DOWN:
                    goDown();
                    break;
                case COMMAND_OPEN:
                    openDoor();
                    break;
                case COMMAND_CLOSE:
                    closeDoor();
                    break;
                case COMMAND_SETFLOOR:
                    System.out.println("enter floor");
                    int floor = keyboard.nextInt();
                    setFloor(floor);
                    break;
            }

        }

        System.out.println(" end of program~  ");


    }

    public static void openDoor() {
        if (isDoorOpen) {
            System.out.println("Door is open already!");
            return;
        }
        System.out.println("Opening door.");
        isDoorOpen = true;
        System.out.println("Door is open.");
    }

    public static void closeDoor() {
        if (!isDoorOpen) {
            System.out.println("Door is closed already!");
            return;
        }
        System.out.println("Closing door.");
        isDoorOpen = false;
        System.out.println("Door is closed.");
    }

    public static void goUp() {
        if (currentFloor == MAX_FLOORS) {
            System.out.println("Cannot go up");
        }
        if (currentFloor < MAX_FLOORS) {
            System.out.println("Going up one floor.");
            currentFloor++;
            System.out.println("Floor:" + currentFloor);
        }
    }

    public static void goDown() {
        if (currentFloor == MIN_FLOORS) {
            System.out.println("Cannot go down.");
        }
        if (currentFloor > MIN_FLOORS) {
            System.out.println("Going down one floor.");
            currentFloor--;
            System.out.println("Floor:" + currentFloor);
        }
    }

    public static void setFloor(int desiredFloor) {
        if (desiredFloor > MAX_FLOORS || desiredFloor < MIN_FLOORS) {
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

}


