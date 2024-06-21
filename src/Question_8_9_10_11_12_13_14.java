import java.util.Arrays;
import java.util.Scanner;

public class Question_8_9_10_11_12_13_14 {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // q8();
        // q9();
        // q10();
        // q11();
        // q12();
        // q13();
        // scanner.close();
        q14();
    }

    // Question 8
    public static void q8() {
        System.out.println("Question 8:");
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Input number: ");
        int number = scanner.nextInt(); // Read the number

        // Check if the number is positive or negative
        if (number > 0) {
            System.out.println(number + " ---> (" + number + " > 0) ---> True ----> Number is Positive");
        } else if (number < 0) {
            System.out.println(number + " ---> (" + number + " < 0) ---> True ----> Number is Negative");
        } else {
            System.out.println(number + " ---> (" + number + " == 0) ---> True ----> Number is Zero");
        }

        // Close the scanner
        scanner.close();
    }

    // Question 9
    public static void q9() {
        System.out.println("Question 9:");
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 7
        System.out.print("Input number: ");
        int dayNumber = scanner.nextInt(); // Read the number

        // Variable to store the name of the weekday
        String weekdayName;

        // Determine the weekday name based on the input number
        switch (dayNumber) {
            case 1:
                weekdayName = "Monday";
                break;
            case 2:
                weekdayName = "Tuesday";
                break;
            case 3:
                weekdayName = "Wednesday";
                break;
            case 4:
                weekdayName = "Thursday";
                break;
            case 5:
                weekdayName = "Friday";
                break;
            case 6:
                weekdayName = "Saturday";
                break;
            case 7:
                weekdayName = "Sunday";
                break;
            default:
                weekdayName = "Invalid input"; // For numbers outside 1-7
                break;
        }

        // Display the result
        if (!weekdayName.equals("Invalid input")) {
            System.out.println("Input -> " + dayNumber + " -> " + weekdayName);
        } else {
            System.out.println(weekdayName); // Display error message for invalid input
        }

        // Close the scanner
        scanner.close();
    }

    // Question 10
    public static void q10() {
        System.out.println("Question 10:");
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Input number: ");
        int n = scanner.nextInt(); // Read the number

        // Initialize sum to 0
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add current number to sum
        }

        // Display the sum of the first n natural numbers
        System.out.println(" -----> Sum of first " + n + " natural numbers are: " + sum);

        // Close the scanner
        scanner.close();
    }

    // Question 11
    public static void q11() {
        System.out.println("Question 11:");
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt(); // Read the number of rows

        int number = 1; // Initialize number to 1

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Print numbers for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increase the number by 1
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }

    // Question 12
    public static void q12() {
        System.out.println("Question 12:");
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt(); // Read the number of rows

        // Loop through each row
        for (int i = rows; i >= 1; i--) {
            // Print asterisks for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }

    // Question 13
    public static void q13() {
        System.out.println("Question 13:");
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt(); // Read the first number

        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt(); // Read the second number

        System.out.print("Input third number: ");
        int thirdNumber = scanner.nextInt(); // Read the third number

        // Check if all three numbers are equal
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }

        // Close the scanner
        scanner.close();
    }

    // Question 14
    public static void q14() {
        System.out.println("Question 14:");
        int[] arr = { 1, 4, 17, 7, 25, 3, 100 }; // Given array
        int k = 3; // Number of largest elements to find
        System.out.println("Original array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println("\n" + k + " largest elements in the array are:");
        Arrays.sort(arr); // Sort the array
        for (int i = arr.length - k; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
