package week5;
import java.util.Scanner;
public class week5program2 {
    static class Student {
        private String name;
        private int marks1, marks2, marks3;
        public Student(String name, int marks1, int marks2, int marks3) {
            this.name = name;
            this.marks1 = marks1;
            this.marks2 = marks2;
            this.marks3 = marks3;
        }
        public double calculatePercentage() {
            return (marks1 + marks2 + marks3) / 3.0;
        }
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
            System.out.println("Percentage: " + calculatePercentage() + "%");
            System.out.println("----------------------");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter 3 subject marks: ");
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
        Student s1 = new Student(name, m1, m2, m3);
        s1.displayInfo();
        sc.close();
    }
}

