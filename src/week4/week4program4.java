package week4;

import java.util.Scanner;
public class week4program4 {
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == key) return i;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int idx = linearSearch(arr, key);
        System.out.println(idx == -1 ? "Element not found." : "Element found at index " + idx);
        sc.close();
    }
}
