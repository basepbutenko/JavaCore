package Another;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsDemo2 {
    public static void main(String[] args) {

            function1();

        System.out.println("end of main()");

    }

    static void function1()  {
        function2();
        System.out.println("function1()");
    }

    static void function2()  {
        function3();
        System.out.println("function2()");
    }

    static void function3()  {

        try {
            FileInputStream s = new FileInputStream(".././.test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("function3()");

    }
}
