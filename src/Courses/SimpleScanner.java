package Courses;

import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//будет поток ввода.Вводим ТОЛЬКО ЦИФРЫ!!!
        int i = scanner.nextInt();
        float f = scanner.nextFloat();
        String str= scanner.next();//считывает до первого пробела
        scanner=new Scanner(System.in);
        String str1= scanner.nextLine();//считывает всю строку
        System.out.println("Number " + i+" "+ "Float a"+f+" "+"Word "+str+" "+"Line "+str1);

    }
}
