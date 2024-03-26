package TaskLoop;

import java.util.Scanner;

public class TaskLoop {
    public static void main(String[] args) {
        System.out.println("guess the color in 5 attempts");
        System.out.println("to exit the program, type the following text -exit");

        final int MAX_ATTEMPT = 6;
        int attempt = 0;
        String color = "red";
        Scanner in = new Scanner(System.in);

        while (attempt<MAX_ATTEMPT){
            attempt++;
            System.out.println("attempt "+ attempt + ":");
            String value = in.next();

            if(value.equals("exit")){
                break;
            }
            if(!value.equals(color)){
                continue;
            }
            System.out.println("congratulate!!! you guessed right after " + attempt + " attemp");
            break;
        }
            System.out.println("The end");
        }



    }

