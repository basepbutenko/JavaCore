import java.io.*;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class FormatDemo {
    public static void main(String[] args) throws IOException {
        int age = 16;
        String name = "Ukraine";
        System.out.println("Hello my name is " + name + ". Age is " + age);
        System.out.format("Hello my name is %s. Age is %d \n", name, age);
        /*
         %s - это строка, в которую
        подставится значение "name", а в %d - подставится значение age. Тема форматированный вывод
        \n - перенос строки
        */
        int age1 = 50;
        String name1 = "CANADA";
        System.out.format("Hello! my country is %s. Age is %d \n", name1, age1);
        int age2 = 60;
        String name2 = "USA";
        System.out.format("Hello! my country is %s. Age is %d \n", name2, age2);
        /*
        записываем данные в файл
         */

        File file = new File("myfile.txt");
        long length = file.length();
        file.canRead();
        PrintWriter out = new PrintWriter(file, "UTF-8");
        out.format("Hello! my country is %s. Age is %d \n", name1, age1);
        out.close();
        System.out.println("§§§§§§§§§§§§§§§§§§§§§§  "+ length);

        readFile();


        System.currentTimeMillis();
        ///////
        outer: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i * j));}
                System.out.println();
        }
    }

    private static void readFile() throws IOException {
        Scanner in = new Scanner(Paths.get("myfile.txt"), "UTF-8");
        String str = in.nextLine();

        System.out.println(str);
    }
}
