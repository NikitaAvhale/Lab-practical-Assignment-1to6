package LabAssignments;


import java.util.Scanner;

	class MyDate {
	    private int day, month, year;

	    public MyDate() {}

	    public MyDate(int day, int month, int year) {
	        this.day = day;
	        this.month = month;
	        this.year = year;
	    }

	    public void accept() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter day: ");
	        day = sc.nextInt();
	        System.out.print("Enter month: ");
	        month = sc.nextInt();
	        System.out.print("Enter year: ");
	        year = sc.nextInt();
	    }

	    public void display() {
	        System.out.println("Date of Birth: " + day + "/" + month + "/" + year);
	    }
	}

	class Person {
	    private int id;
	    private String name;
	    private MyDate dob;
	    private static int cnt = 1;

	    public Person() {
	        id = cnt++;
	        dob = new MyDate();
	    }

	    public Person(String name, MyDate dob) {
	        this.id = cnt++;
	        this.name = name;
	        this.dob = dob;
	    }

	    public void accept() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter name: ");
	        name = sc.nextLine();
	        dob.accept();
	    }

	    public void display() {
	        System.out.println("\nPerson ID: " + id);
	        System.out.println("Name: " + name);
	        dob.display();
	    }
	}

	public class A1SCQ1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of persons: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // consume newline

	        Person[] persons = new Person[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter details for Person " + (i + 1));
	            persons[i] = new Person();
	            persons[i].accept();
	        }

	        System.out.println("\n--- Person Details ---");
	        for (Person p : persons) {
	            p.display();
	        }
	    }
	}