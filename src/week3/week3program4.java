package week3;
import java.util.Scanner;
public class week3program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid. Enter a number: ");
            sc.next();
        }
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid. Enter a number: ");
            sc.next();
        }
        double b = sc.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().trim().charAt(0);
        double result;
        switch (op) {
            case '+':
                result = a + b;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    result = a / b;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }

        sc.close();
    }
}

