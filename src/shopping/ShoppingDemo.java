package shopping;

import java.util.Scanner;

public class ShoppingDemo {
    public static final int COMMAND_ADD = 1;
    public static final int COMMAND_DELETE = 2;
    public static final int COMMAND_DISPLAY = 3;

    public static void main(String[] args) {
        System.out.println(" введите command ");
        System.out.println(" enter 1 to go add ");
        System.out.println(" enter 2 to go delete");
        System.out.println(" enter 3 to go display");
        Scanner keyboard = new Scanner(System.in);
        ShoppingList shoppingList = new ShoppingList();
        int command = -1;
        while (command != 0) {

            command = keyboard.nextInt();
            switch (command) {
                case COMMAND_ADD:
                    System.out.println("enter item");
                    String name = keyboard.next();
                    shoppingList.add(name);
                    break;
                case COMMAND_DELETE:
                    System.out.println("index");
                    Integer index = keyboard.nextInt();
                    shoppingList.delete(index);
                    break;
                case COMMAND_DISPLAY:
                    shoppingList.display();
                    break;
            }

        }

        System.out.println(" end of program~  ");
    }

}

