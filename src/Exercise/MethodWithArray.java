package Exercise;

public class MethodWithArray {
    static int[]modifyArray(int[]array,int modifier){
        for (int i = 0; i <array.length ; i++) {
            array[i]=array[i]*modifier;
        }
        return array;
    }

    public static void main(String[] args) {
        int[]myArray={2,4,6,8,18};
        myArray=modifyArray(myArray,5);

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");

        }
    }
}
