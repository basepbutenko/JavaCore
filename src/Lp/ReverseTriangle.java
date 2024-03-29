package Lp;

public class ReverseTriangle extends LoopSimple {
    public static void friend (int a) {
        for (int i = 0; i < 10; i++) {
            for (int j=0; j<a-i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
