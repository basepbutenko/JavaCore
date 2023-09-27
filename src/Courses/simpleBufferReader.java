package Courses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class simpleBufferReader {
    public static void main(String[] args) throws IOException {
//        //говорим, что мы будем выводить с клавиатуры
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            String str = bufferedReader.readLine();
//            //int num = Integer.parseInt(bufferedReader.readLine());//245, а в SOP необходимо вставить num
//            //System.out.println(num);
//            System.out.println(str);
//        } catch (IOException e) {
//            e.printStackTrace();
//        system.in=>byte
//        int i = System.in.read();
//        System.out.println(i);// считывает байты поэтому будет 53
//        System.out.println((int) i);
//        System.out.println((char) i);
        InputStreamReader is = new InputStreamReader(System.in);
        int i2 = is.read();
        System.out.println((char) i2);
        System.out.println( i2);

    }


}

