package LabAssignments;

import java.util.Scanner;
import java.util.Arrays;

class Account {
    int accNo;
    String accName;
    double balance;

    public Account(int accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account No: " + accNo + ", Name: " + accName + ", Balance: ₹" + balance);
    }

    public static void sortAccount(Account[] accounts) {
        Arrays.sort(accounts, (a1, a2) -> Double.compare(a1.balance, a2.balance));
    }
}

public class A1SBQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine();

        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account " + (i + 1));
            System.out.print("Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Account Name: ");
            String accName = sc.nextLine();

            System.out.print("Balance: ");
            double balance = sc.nextDouble();

            accounts[i] = new Account(accNo, accName, balance);
        }

 
        Account.sortAccount(accounts);

        System.out.println("\nAccounts sorted by balance:");
        for (Account acc : accounts) {
            acc.display();
        }

        sc.close();
    }
}