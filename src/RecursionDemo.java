
class RecursionDemo {
    public static void main(String[] args) {
// factorial demo :
//        3! = 1*2*3 = 6
//        10! = 1*2*3*4*5*6*7*8*9*10 = 3628800

        int x = 5;
        int result = calcFactorial(x);
        System.out.println(result);
    }

    public static int calcFactorial(int n) {
        System.out.println("enter calc Factorial n: " + n);
        if (n == 1) {
            System.out.println("exit calc Factorial n: " + n);
            return n;
        } else {
            int calcFactorial = calcFactorial(n - 1);
            System.out.println("exit calc Factorial n: " + n);
            return n * calcFactorial;
        }
    }
}


