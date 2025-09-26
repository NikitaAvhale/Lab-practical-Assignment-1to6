package Assignment33;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }
}

public class A3SAQ2 {
    public static void main(String[] args) {
        Map<String, Employee> employeeMap = new HashMap<>();
        employeeMap.put("John", new Employee("John", 50000));
        employeeMap.put("Alice", new Employee("Alice", 60000));
        employeeMap.put("Bob", new Employee("Bob", 45000));

        System.out.println("Employee details:");
        for (Employee emp : employeeMap.values()) {
            System.out.println(emp);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String searchName = scanner.next();
        if (employeeMap.containsKey(searchName)) {
            System.out.println("Employee found: " + employeeMap.get(searchName));
        } else {
            System.out.println("Employee not found.");
        }
        scanner.close();
    }
}