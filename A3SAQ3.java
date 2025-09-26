package Assignment33;

import java.util.Scanner;
import java.util.TreeSet;

public class A3SAQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();
        
        TreeSet<Integer> uniqueIntegers = new TreeSet<>();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            uniqueIntegers.add(scanner.nextInt());
        }
        
        System.out.println("Unique integers in sorted order: " + uniqueIntegers);
        scanner.close();
    }
}