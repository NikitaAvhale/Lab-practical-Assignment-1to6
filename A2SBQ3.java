package Assingnment2;

import java.util.Scanner;

//Abstract class Staff
abstract class Staff {
 String name;
 String address;
 String department;

 Staff(String name, String address, String department) {
     this.name = name;
     this.address = address;
     this.department = department;
 }

 abstract void calculateSalary();
 abstract void displayDetails();
}

//Subclass FullTimeStaff
class FullTimeStaff extends Staff {
 double salary;
 double hra;
 double da;

 FullTimeStaff(String name, String address, String department, double salary) {
     super(name, address, department);
     this.salary = salary;
     this.hra = 0.08 * salary;
     this.da = 0.05 * salary;
 }

 @Override
 void calculateSalary() {
     // Salary is already calculated in constructor
 }

 @Override
 void displayDetails() {
     System.out.println("Name: " + name);
     System.out.println("Address: " + address);
     System.out.println("Department: " + department);
     System.out.println("Salary: " + salary);
     System.out.println("HRA: " + hra);
     System.out.println("DA: " + da);
     System.out.println("Total Salary: " + (salary + hra + da));
 }
}

//Subclass PartTimeStaff
class PartTimeStaff extends Staff {
 int numberOfHours;
 double ratePerHour;

 PartTimeStaff(String name, String address, String department, int numberOfHours, double ratePerHour) {
     super(name, address, department);
     this.numberOfHours = numberOfHours;
     this.ratePerHour = ratePerHour;
 }

 @Override
 void calculateSalary() {
     // Salary calculation is done on the fly in displayDetails
 }

 @Override
 void displayDetails() {
     double salary = numberOfHours * ratePerHour;
     System.out.println("Name: " + name);
     System.out.println("Address: " + address);
     System.out.println("Department: " + department);
     System.out.println("Number of Hours: " + numberOfHours);
     System.out.println("Rate per Hour: " + ratePerHour);
     System.out.println("Salary: " + salary);
 }
}

public class A2SBQ3 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter your choice (1 for FullTimeStaff, 2 for PartTimeStaff): ");
     int choice = scanner.nextInt();
     scanner.nextLine(); // Consume newline

     if (choice == 1) {
         System.out.println("Enter name: ");
         String name = scanner.nextLine();
         System.out.println("Enter address: ");
         String address = scanner.nextLine();
         System.out.println("Enter department: ");
         String department = scanner.nextLine();
         System.out.println("Enter salary: ");
         double salary = scanner.nextDouble();

         FullTimeStaff fullTimeStaff = new FullTimeStaff(name, address, department, salary);
         fullTimeStaff.displayDetails();
     } else if (choice == 2) {
         System.out.println("Enter name: ");
         String name = scanner.nextLine();
         System.out.println("Enter address: ");
         String address = scanner.nextLine();
         System.out.println("Enter department: ");
         String department = scanner.nextLine();
         System.out.println("Enter number of hours: ");
         int numberOfHours = scanner.nextInt();
         System.out.println("Enter rate per hour: ");
         double ratePerHour = scanner.nextDouble();

         PartTimeStaff partTimeStaff = new PartTimeStaff(name, address, department, numberOfHours, ratePerHour);
         partTimeStaff.displayDetails();
     } else {
         System.out.println("Invalid choice");
     }

     scanner.close();
 }
}