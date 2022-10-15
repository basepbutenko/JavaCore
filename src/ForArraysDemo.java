import java.util.stream.Stream;

class ForArraysDemo {
    public static void main(String[] args) {

        Stream.of(1,2,4, 7 , 8)
                .filter(integer -> integer > 4)
                .forEach(s -> {
            System.out.println("s: " + s);
        });

        System.out.println("§§§§§§§§");

        int [] array177 = { 1 , 2 , 3 , 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array177.length; i++ ){

            if(array177[i] == 10){
               continue;
            }
            System.out.println(array177[i]);
        }
        System.out.println("§§§§§§§§");

        boolean x = true;

        int iiii = 0;
        for(; x == true;){

            if(iiii == array177.length){
                x = false;
                break;
            }
            System.out.println(" iiii :" + array177[iiii]);

            iiii++;
        }

        System.out.println(" iiii after loop :" + iiii);
        System.out.println("while !!!§§§§§§§§");

        int yyyy = 0;

        boolean xx= true;
        while (xx){
            if(yyyy == array177.length){
                xx = false;
                break;
            }
            System.out.println(" yyyy :" + array177[yyyy]);

            yyyy++;
        }


        System.out.println("§§§§§§§§");

        int [] array666 = { 1 , 2 , 3 , 4, 5, 6, 7, 8, 9, 10};



        for (int i = array666.length - 1; i >= 0; --i ){
            if(array666[i] == 6){
                break;
            }
            System.out.println(array666[i]);
        }
        System.out.println("§§§§§§§§");






        System.out.println("args:");
        for (String item : args) {
            System.out.println(item);
        }
        System.out.println("§§§§§§§§");



        int [] array1 = { 1 , 2 , 3 };

        for (int i = 0; i < array1.length; i++){
            if( i == array1.length - 1 ){
                System.out.println(array1[i]);
            }
        }

        int [] array33 = new int[4];
//копирование массива циклом for
        for (int i = 0; i < array1.length; i++) {
            array33[i] = array1[i];
        }
        array33[3] = 9;

        System.out.println("§§§§§§§§ array33: ");

        for (int item : array33) {
            System.out.println(item);
        }
        System.out.println("§§§§§§§§");


        int [] arr4 = new int[4];
        System.arraycopy(array1, 0, arr4, 0, array1.length);


        System.out.println("§§§§§§§§ arr4: ");

        for (int item : arr4) {
            System.out.println(item);
        }
        System.out.println("§§§§§§§§");

        System.out.println("§§§§§§§§");



        boolean [] array2231 = { true , false, false, true };// сокращенная запись for_each

        for (boolean item : array2231) {
            System.out.println(item);
        }
        System.out.println("§§§§§§§§");



        int [] array122 = new int[20];

        for (int i = 0; i < array122.length; i++){
           array122[i] = i;
        }

        for (int i = 0; i < array122.length; i++){
            System.out.println(array122[i]);
        }

        System.out.println("§§§§§§§§");



        int [][] array = {
                {1 ,2 ,3}, // element index: 0, element length : 3
                {23, 2 , 66 }, // 1
                {33, 44, 55} // 2
        };

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }


        System.out.println("§§§§§§§§");



        int [][] array3 = {
                {1 , 2 , 3}, // element index: 0, element length : 3
                {23, 2 , 66 }, // 1
                {33, 44, 55} // 2
        };

        for (int i = 0; i < array3.length; i++){
            for (int j = 0; j < array3[i].length; j++){
                if (i == j) {
                    System.out.print(array3[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.print("\n");
        }

        System.out.println("§§§§§§§§");



        String [][] array4 = {
                {"[0][0]" , "[0][1]" , "[0][2]"}, // element index: 0, element length : 3
                {"[1][0]",  "[1][1]",  "[1][2]" }, // 1
                {"[2][0]",  "[2][1]",  "[2][2]" } // 2
        };


        for (int i = 0; i < array4.length; i++){

            for (int j = 0; j < array4[i].length; j++){
                if ( i == 1) { ////
                    System.out.print(array4[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.print("\n");
        }

        System.out.println("§§§§§§§§");


        String [][] array12 = {
                {"00" , "01" , "02", "03", "04"}, // element index: 0, element length : 3
                {"10",  "11",  "12", "13", "14" }, // 1
                {"20",  "21",  "22", "23", "24" }, // 2
                {"30",  "31",  "32", "33", "34" } ,// 2
                {"40",  "41",  "42", "43", "44" } // 2
        };

        for (int i = 0; i < array12.length; i++){
            for (int j = 0; j < array12[i].length; j++){
                if ((i + j) == array12.length - 1) { ////
                    System.out.print(array12[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.print("\n");
        }




        System.out.println("§§§§§§§§");


        String [][] array13 = {
                {"00" , "01" , "02", "03", "04"}, // element index: 0, element length : 3
                {"10",  "11",  "12", "13", "14" }, // 1
                {"20",  "21",  "22", "23", "24" }, // 2
                {"30",  "31",  "32", "33", "34" } ,// 2
                {"40",  "41",  "42", "43", "44" } // 2
        };

        for (int i = 0; i < array13.length; i++){
            for (int j = 0; j < array13[i].length; j++){
                if ((i + j) > array13.length - 1) { ////
                    System.out.print(array13[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.print("\n");
        }


        System.out.print(        sum(1 ,1 ));
        System.out.print(        sum(3 ,14 ));
        System.out.print(        sum(4 ,13 ));
        System.out.print(        sum(5 ,12 ));
        System.out.print(        sum(6 ,11 ));

    }

    // input : 3, 2
    // output : 5



    // input : 2, 2
    // output : 4



    public static final int sum(int a, int b){
        return a + b;
    }


}


