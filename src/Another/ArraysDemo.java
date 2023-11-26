package Another;

import java.util.LinkedList;

class ArraysDemo {
    public static void main(String[] args) {
        String[] array = new String[10];

        int u = 1;
        u = u + 2;
        u += 2;

        u = 7;
        u=8;

        String[] array2 = {"a", "b", "c"};

        int[] array23 = {1, 2, 3, 4, 5};
        int[] array24 = new int[]{1, 2, 3};

        System.out.println(array23[0]); // 1
        System.out.println(array23[4]); // 5
        System.out.println("_________________"); // 5

        int[][] aewrr = {
                {1, 2, 3}, // 0
                {23, 2, 66}, // 1
                {33, 44, 55} // 2
        };

//        System.out.println(aewrr[1][2]); //


        int[][][] dsfjiosdr = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
        };

//        System.out.println(threeDimensionsArray[2][0][1]); // 2


        int [] insert = {1,2,3,5,6};// вставить
        int value=4;// значение
        int[] result=new int[insert.length+1];
        System.arraycopy(insert, 0,result, 0,3);
        result [3]=value;
        System.arraycopy(insert, 3,result, 4,2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }


}


