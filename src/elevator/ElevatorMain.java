package elevator;

import elevator.Elevator;

import java.util.Scanner;

public class ElevatorMain {

    public static final int COMMAND_UP = 1;
    public static final int COMMAND_DOWN = 2;
    public static final int COMMAND_OPEN = 3;
    public static final int COMMAND_CLOSE = 4;
    public static final int COMMAND_SETFLOOR = 5;

    public static final int COMMAND_SHOW_DOOR_STATE = 6;

    public static void main(String[] args) {
        System.out.println(" введите command ");
        System.out.println(" enter 1 to go up ");
        System.out.println(" enter 2 to go down ");
        System.out.println(" enter 3 to open the door ");
        System.out.println(" enter 4 to close the door ");
        System.out.println("enter 5 to set floor");
        System.out.println("enter 6 to see door state");
        //elevator.Elevator elevator = new elevator.Elevator(20);
        Elevator elevator = new Elevator(true, 10, 25);

        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int command = -1;


        while (command != 0) {

            command = keyboard.nextInt();
            switch (command) {
                case COMMAND_UP:
                    elevator.goUp();
                    break;
                case COMMAND_DOWN:
                    elevator.goDown();
                    break;
                case COMMAND_OPEN:
                    elevator.openDoor();
                    break;
                case COMMAND_CLOSE:
                    elevator.closeDoor();
                    break;
                case COMMAND_SETFLOOR:
                    System.out.println("enter floor");
                    int floor = keyboard.nextInt();
                    elevator.setFloor(floor);
                    break;
                case COMMAND_SHOW_DOOR_STATE:
                    boolean doorOpen = elevator.isDoorOpen();
                    System.out.println("door state is: ");
                    System.out.println(doorOpen);
                    System.out.println("floor is: " + elevator.getCurrentFloor());
                    break;
            }

        }

        System.out.println(" end of program~  ");


    }

}


