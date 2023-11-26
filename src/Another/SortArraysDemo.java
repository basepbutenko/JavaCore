package Another;

import java.util.Arrays;

class SortArraysDemo {
    public static void main(String[] args) {


// отсортированный массив { 0 1	 2	3   21	32	44	123	323 }

        int[] array = {44, 21, 32, 123, 2, 0, 1, 323, 3};
//     утиллита для сортировки Arrays.sort(array);
//        Arrays.sort(array);
// сортировка пузырьком = bubble sort

        for (int j = 0; j < array.length; j++) {
            for (int i = 1; i < array.length; i++) {
                int currentElement = array[i];
                int previousElement = array[i - 1];
                if (currentElement < previousElement) {
//                меняем местами
                    int tempVariable = currentElement;
                    array[i] = array[i - 1];
                    array[i - 1] = tempVariable;
                }
            }
        }

//        вывести на экран
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + "\t");
            System.out.print("i:" + i + "\t");

        }


//   i:       0    1    2    3   4  5  6   7    8
//   1)     { 44 , 21 , 32, 123, 2, 0, 1, 323 , 3}
//   2)     { 21 , 44 , 32, 123, 2, 0, 1, 323 , 3}
//   3)     { 21 , 32 , 44, 123, 2, 0, 1, 323 , 3}
//   4)     { 21 , 32 , 44, 123, 2, 0, 1, 323 , 3}
//   5)     { 21 , 32 , 44, 2, 123, 0, 1, 323 , 3}
//   6)     { 21 , 32 , 44, 2, 0, 123, 1, 323 , 3}
//   7)     { 21 , 32 , 44, 2, 0, 1, 123, 323 , 3}
//   8)     { 21 , 32 , 44, 2, 0, 1, 123, 3 , 323}


//   i:       0      1     2   3   4  5  6   7    8
//   1)     { 323 , 123 , 44, 32, 21, 3, 2, 1 , 0}
//   2)     { 123 , 323 , 44, 32, 21, 3, 2, 1 , 0}
//   3)     { 123 , 44 , 323, 32, 21, 3, 2, 1 , 0}
//   4)     { 123 , 44 , 32, 323, 21, 3, 2, 1 , 0}
//   5)     { 123 , 44 , 32, 21, 323, 3, 2, 1 , 0}
//   6)     { 123 , 44 , 32, 21, 3, 323, 2, 1 , 0}
//   7)     { 123 , 44 , 32, 21, 3, 2, 323, 1 , 0}
//   8)     { 123 , 44 , 32, 21, 3, 2, 1, 323 , 0}


    }


}


