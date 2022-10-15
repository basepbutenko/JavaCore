import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.AccessDeniedException;

public class ExceptionsDemo {
    public static void main(String[] args) {
        try {
            function1();
        } catch (FileNotFoundException e) {
            System.out.println("err main()");

        } catch (IOException f){
            System.out.println("err main()");

        }
        System.out.println("end of main()");

    }

    static void function1() throws FileNotFoundException, AccessDeniedException {
        function2();
        System.out.println("function1()");
    }

    static void function2() throws FileNotFoundException, AccessDeniedException {
        function3();
        System.out.println("function2()");
    }

    static void function3() throws FileNotFoundException , AccessDeniedException {

            FileInputStream s = new FileInputStream(".././.test.txt");


        System.out.println("function3()");

    }
}
