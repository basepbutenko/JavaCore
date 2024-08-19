package arrays;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[]numbers={1,12, 55, 630, 3, 99, 34,122223, 92330939};
        String[] studentsName={"Aleks", "Nik", "Rayan", "Tod"};

        Arrays.sort(numbers);
        Arrays.sort(studentsName);

        for(int tmp:numbers){
            System.out.println(tmp + " ");
        }
        for(String tmp:studentsName){
            System.out.println(tmp +"");
        }
    }
}
