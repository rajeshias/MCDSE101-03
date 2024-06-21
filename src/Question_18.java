import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number");
        double secondNumber = scanner.nextDouble();
        double result;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", firstNumber, operator, secondNumber, result);
    }
}