package week3;
public class week3program3 {
    public static void main(String[] args) {
        int count = 10;
        int n1 = 0, n2 = 1;
        System.out.print("Fibonacci Series (" + count + " numbers): ");
        if (count <= 0) {
            System.out.println("No terms to display.");
            return;
        }
        if (count == 1) {
            System.out.println(n1);
            return;
        }
        System.out.print(n1 + ", " + n2);
        for (int i = 2; i < count; i++) {
            int n3 = n1 + n2;
            System.out.print(", " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println();
    }
}

