package Assignment33;

import java.io.*;
import java.util.*;

public class A3SCQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numberSet = new LinkedHashSet<>(); 
        Random rand = new Random();
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Load (Generate 10 random two-digit numbers)");
            System.out.println("2. Save (Write numbers to number.txt)");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    numberSet.clear();
                    while (numberSet.size() < 10) {
                        numberSet.add(rand.nextInt(90) + 10); 
                    }
                    System.out.println("Generated Numbers: " + numberSet);
                    break;

                case 2:
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("number.txt"))) {
                        for (int num : numberSet) {
                            writer.write(num + "\n");
                        }
                        System.out.println("Numbers saved to number.txt");
                    } catch (IOException e) {
                        System.out.println("Error saving to file: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}