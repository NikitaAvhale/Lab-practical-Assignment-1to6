package Assingnment2;


	import java.util.Scanner;

	class Employee {
	    protected int id;
	    protected String name;
	    protected double salary;

	    
	    public Employee() {
	        this.id = 0;
	        this.name = "";
	        this.salary = 0.0;
	    }

	    
	    public void accept() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Employee ID: ");
	        id = sc.nextInt();
	        sc.nextLine(); // Consume newline
	        System.out.print("Enter Employee Name: ");
	        name = sc.nextLine();
	        System.out.print("Enter Employee Salary: ");
	        salary = sc.nextDouble();
	    }

	   
	    public void display() {
	        System.out.println("Employee ID: " + id);
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee Salary: " + salary);
	    }
	}

	class Manager extends Employee {
	    private double bonus;
	   
	    public void accept() {
	        super.accept();
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Bonus: ");
	        bonus = sc.nextDouble();
	    }

	    
	    public void display() {
	        super.display();
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Total Salary: " + (salary + bonus));
	    }

	    
	    public double getTotalSalary() {
	        return salary + bonus;
	    }
	}

	public class A2SAQ3 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of Managers (n): ");
	        int n = sc.nextInt();
	        Manager[] managers = new Manager[n];

	        for (int i = 0; i < n; i++) {
	            managers[i] = new Manager();
	            System.out.println("Enter details of Manager " + (i + 1));
	            managers[i].accept();
	        }

	        
	        Manager maxSalaryManager = managers[0];
	        for (int i = 1; i < n; i++) {
	            if (managers[i].getTotalSalary() > maxSalaryManager.getTotalSalary()) {
	                maxSalaryManager = managers[i];
	            }
	        }

	        System.out.println("\nManager with Maximum Total Salary:");
	        maxSalaryManager.display();
	    }
	}

