package Courses;

import java.io.ByteArrayInputStream;

public class SimpleByteArrayInputStream {
    public static void main(String[] args) {
        byte[] arr = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);
        /* необходимо пробежать по классу и считать все данные. Далее создаем вспомагательную переменную
        при помощи цикла while мы пробегаем, вызывая метод read и считываем данные
        */
        int tmp;

        while ((tmp = byteArrayInputStream.read()) != -1) {
            System.out.print(tmp + " ");
        }
        /* offset и количество символов, которые нам необходимо считать */
        String str = "Hello";
        byte[] arr2 = str.getBytes();
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr2, 0, 7);
        /*создаем вспомагательную переменную*/
        int tmp2;

        while ((tmp2 = byteArrayInputStream1.read()) != -1) {
            System.out.print((char) tmp2+"+ ");
            /*если применяем char то выводятся символы, даже если length введем 70 ошибки не будет, считает только
            * существующие символы, offset 0-означает считываение с нулевой позици слова Hello */
        }
    }
}
