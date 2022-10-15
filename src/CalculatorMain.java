public class CalculatorMain {
    public static final int COMMAND = 0;

    public static void main(String[] args) {
        int num1 = Calculator.getInt();
        int num2 = Calculator.getInt();
        char operation = Calculator.getOperation();
        double result = Calculator.calc(num1, num2, operation);
        System.out.println("result operation: " + result);
    }

}
