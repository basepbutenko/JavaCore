package Courses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SimpleErr {
    public static void main(String[] args) {
        System.err.println("File opening failed");
        try {
            InputStream inputStream=new FileInputStream("D:");
            System.out.println("File is opened");
        } catch (FileNotFoundException e) {
            System.err.println("File opening failed");
            e.printStackTrace();
        }
    }
}
