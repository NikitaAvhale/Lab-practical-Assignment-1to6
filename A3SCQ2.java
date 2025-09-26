package Assignment33;

import java.util.Scanner;


class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}


class MyDate {
    int day, month, year;

    public void accept() throws InvalidDateException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day (dd): ");
        day = sc.nextInt();
        System.out.print("Enter month (mm): ");
        month = sc.nextInt();
        System.out.print("Enter year (yyyy): ");
        year = sc.nextInt();

        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid Date Entered!");
        }
    }

    public void display() {
        System.out.println("Valid Date: " + day + "/" + month + "/" + year);
    }

    private boolean isValidDate(int d, int m, int y) {
        if (m < 1 || m > 12 || d < 1) return false;

        int[] daysInMonth = {
            31, isLeapYear(y) ? 29 : 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        return d <= daysInMonth[m - 1];
    }

    private boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }
}

public class A3SCQ2 {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        try {
            date.accept();
            date.display();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}