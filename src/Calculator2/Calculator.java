package Calculator2;

import java.util.Scanner;

public class Calculator {
   private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        int firstOperand=getUserInput("Please, enrer the first number:   ");
        int secondOperand = getUserInput("Please, enter the second number: ");
        char operation = getOperation();
        double result = calculate(firstOperand, secondOperand, operation);
        System.out.println("result" + result);
    }
    private static int getUserInput(String prompt){
        System.out.println(prompt);
        while (!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a valid integer.");
            System.out.println(prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }
    private static char getOperation(){
        System.out.println("Enter the operation: +, -, *, /");
        char operation = scanner.next().charAt(0);
        while (operation!= '+'&& operation!= '-'&&operation!= '*'&&operation!= '/'){
            System.out.println("Invalid operation. Please enter a valid operation (+, -, *, /).");
            System.out.println("Enter the operation: +, -, *, /");
            operation = scanner.next().charAt(0);
        }
        return operation;
    }
    private static double calculate(int firstOperand,  int secondOperand, char operation){
        switch (operation){
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand-secondOperand;
            case '*':
                return firstOperand*secondOperand;
            case '/':
                if (secondOperand==0){
                    System.out.println("Error: Division by zero.");
                    return Double.NaN;
                }
                return (double) firstOperand/secondOperand;
            default:
                System.out.println("Error. Invalid operation. Try again");
                return Double.NaN;
        }

    }
}
