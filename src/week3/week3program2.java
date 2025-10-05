package week3;

import java.util.Scanner;

public class week3program2 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter a valid number: ");
            sc.next();
        }
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is not a Prime number.");
        }

        sc.close();
    }
}

