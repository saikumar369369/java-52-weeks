package week2;
import java.util.Scanner;
public class week2program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double P = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        double T = sc.nextDouble();
        System.out.print("Enter Rate (% per year): ");
        double R = sc.nextDouble();
        double SI = (P * T * R) / 100.0;
        System.out.println("Simple Interest = " + SI);
        sc.close();
    }
}
