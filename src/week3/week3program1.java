package week3;
import java.util.Scanner;

public class week3program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        while (!sc.hasNextInt()){
            System.out.println("Invalid input. Enter valid number: ");
            sc.next();
        }
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }
        sc.close();
    }
}
