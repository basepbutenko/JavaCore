package Courses;

import java.util.Scanner;

public class SimpleScannerRegular {
    public static void main(String[] args) {
        String str = "1 Java 2 Java 3 Java";
        Scanner sc = new Scanner(str).useDelimiter("\\s*Java\\s*");
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }
    }
}
