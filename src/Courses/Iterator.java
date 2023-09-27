package Courses;

public class Iterator {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 12, 26, 25};
//        for (int i = 0; i < x.length; i++) {
//            System.out.println(x[i]+"");//вывод на экран эллементов массива при помощи цикла for
//    for (int tmp:x){//int - тип, tmp - имя счетчика итератора х - имя массива
//        System.out.println(tmp+"");
        for (int tmp : x) {
            ++tmp;
            //int - тип, tmp - имя счетчика итератора х - имя массива
            System.out.println(tmp + "");
        }
        System.out.println();
        for (int tmp : x) {
            System.out.println(tmp + "");
        }
    }}

