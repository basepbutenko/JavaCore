package Exercise;

import Another.Switch;

import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {
        System.out.println("Size cofe glases 1 cost 20 dol, 2 - 70 dol, 3 - 120 dol");
        System.out.println("Enter size");
        Scanner sc=new Scanner(System.in);
        String cofesize = sc.nextLine();
        int cost = 0;
        switch (cofesize) {
            case "3":
                cost += 50;
            case "2":
                cost += 50;
            case "1":
                cost += 20;
                break;
            default:
                System.out.println("You chosed is not correct");
                break;
        }
        if (cost!=0) {
            System.out.println("You chosed coffe, pay please: " + cost + "$ USA");
        }else {
            System.out.println("Good by, see you later:)");
        }
            

        }
    }

