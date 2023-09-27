package Courses;

import java.io.*;

public class SimpleDataInputStream {
    public static void main(String[] args) {
        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dataOut.txt")));
            DataInputStream in = new DataInputStream(new BufferedInputStream((new FileInputStream("dataOut.txt"))));
            out.writeShort(1000);
            out.writeInt(122);
            out.writeLong(0b1010L);
            out.writeUTF("Hello Developer");
            out.flush ();// отчищает буфер и пробрасывает все зачения. Без него в файле dataOut не записался текст
            System.out.println("Short"+ in.readShort());
            System.out.println("Int" + in.readInt());
            System.out.println("Long"+ in.readLong());
            System.out.println("UTF"+"-----" + in.readUTF());
            // DataInputStream in=DataInputStream(new BufferedInputStream((new FileInputStream("dataOut.txt"))));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
