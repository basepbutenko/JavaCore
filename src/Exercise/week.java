package Exercise;

import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        System.out.println("Enter weeks day");

        Scanner sc = new Scanner(System.in);
        String week = sc.nextLine();


        switch (week) {
            case "1": {
                System.out.println("Sunday");
                break;
            }
            case "2": {
                System.out.println("Monday");
                break;
            }
            case "3": {
                System.out.println("Tuesday");
                break;
            }
            default: {
                System.out.println("there is no such day");
            }




        }

    }}