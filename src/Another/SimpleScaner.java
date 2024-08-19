package Another;

import java.util.Scanner;

public class SimpleScaner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value INTEGER: ");
        int a=scanner.nextInt();
        System.out.println("Enter value STRING");
        String str= scanner.next();
        System.out.println("Enter value FLOAT: ");
        float f=scanner.nextFloat();
        scanner=new Scanner(System.in);
        System.out.println("Enter value FULL STRING");
        String str1= scanner.nextLine();
        System.err.println("Value INT : "+a+";"+" " + "value STRING: "+" "+str +"; "+"value FLOAT: "+f+"; "+"Value FULL STRING IS: "+str1);
    }
}
