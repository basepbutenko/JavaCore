package Exercise;

public class SimpleRecursion {
    public static void recursion(int num){
       // System.out.println("number: " + num);
        num--;
//        System.out.println("\n");
        System.out.println("the first half of method:"+ num);
        if (num!=0){
            recursion(num);
//            System.out.println();
//            System.out.println("The second hallf of method:"+num);
        }
//        System.out.println();
        System.out.println("The second half of method:"+num);
    }
    public static void main(String[] args) {
        recursion(5);
    }
}
