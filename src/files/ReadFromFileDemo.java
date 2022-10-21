package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ReadFromFileDemo {
    public static void main(String[] args) {
        try {
            OutputStream outputStream=new FileOutputStream("Demo.txt");
          //  outputStream.
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
