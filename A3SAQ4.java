package Assignment33;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A3SAQ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();
        scanner.close();
        
        try {
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);
            int lines = 0, words = 0, chars = 0;
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lines++;
                chars += line.length() + 1;
                words += line.split("\\s+").length;
            }
            fileScanner.close();
            
            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}