package week2;

public class week2program2 {
    public static void main(String[] args) {
        int i = 100;
        double d = i;
        long ln = i;
        System.out.println("Implicit int->double: " + d);
        System.out.println("Implicit int->long: " + ln);
        double x = 9.78;
        int y = (int) x;
        System.out.println("Explicit double->int: " + y);
        long big = 3_000_000_000L;
        int small = (int) big;
        System.out.println("Explicit long->int (overflow demo): " + small);
        char ch = 'Z';
        int code = ch;
        char back = (char) code;
        System.out.println("char 'Z' -> int: " + code);
        System.out.println("int -> char: " + back);
    }
}
