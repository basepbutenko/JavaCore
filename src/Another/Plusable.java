package Another;
/**
 * this class was created to study return methods
 * */
public class Plusable {
    public static void main(String[] args) {
        int calculator = plusable (6, 8);
        System.out.println(calculator);
    }
    // method,
    public static int plusable (int a, int b){
        int summ = a+b;
        return summ;

    }
}
