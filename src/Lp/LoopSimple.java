package Lp;

public class LoopSimple {
        public static void friend(int a){
        for (int i = 0; i < 10; i++) {
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }}
    public static void main(String[] args) {
        friend(10); // Вызываем метод friend из класса LoopSimple
        ReverseTriangle.friend(10); // Вызываем метод friend из класса ReverseTriangle
    }}