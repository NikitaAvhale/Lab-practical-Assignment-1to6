package Assignment33;

import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class A3SBQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Doctor Name: ");
        String name = sc.nextLine();

        try {
            if (!name.matches("[a-zA-Z\\s]+")) {
                throw new InvalidNameException("Name is Invalid");
            } else {
                System.out.println("Valid Doctor Name: " + name);
            }
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}