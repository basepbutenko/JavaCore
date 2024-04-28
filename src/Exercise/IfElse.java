package Exercise;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        String login = "Admin";
        String password = "Oleksii";


        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter please your login:_____ ");
//        System.out.println("Welcome! Try enter your LOGIN");
//        String userLogin = sc.next();
//
//        if(login.equals(userLogin)){
//            System.out.println("Welcome! Try enter your password");
//
//            String userPassword = sc.next();
//            if (password.equals(userPassword)) {
////                for (int i = 0; i < 3; i++) {
////                    System.out.println("You have 3 atteppts");
//
//                System.out.println("Hello " + userLogin + " Welcome to account ");
//            }else {
//                System.out.println("your password is not correct");}
//
//        } else {
//            System.out.println ("no such account found");
//    }

        System.out.println("Hello, try enter your LOGIN please!!!  ");

        String userLogin= sc.nextLine();
        if(login.equals(userLogin)){
            System.out.println("Hi, Enter your PASSWORD please  ");
            String userPassword= sc.next();
            if(password.equals(userPassword)){
                System.out.println("Congratulate!!! You password was correct. Welcome to ACCOUNT");
            }else {
                System.out.println("Your password does not correct");
        }}else {
                System.out.println("Your password does not correct");
            }
    }}