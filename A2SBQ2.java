package Assingnment2;

class Emp {
    String name;
    double salary;

    Emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Developer extends Emp {
    String projectname;

    Developer(String name, double salary, String projectname) {
        super(name, salary);
        this.projectname = projectname;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Project Name: " + projectname);
    }
}

class Programmer extends Developer {
    String programmingLanguage;

    Programmer(String name, double salary, String projectname, String programmingLanguage) {
        super(name, salary, projectname);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class A2SBQ2 {
    public static void main(String[] args) {
        Developer developer = new Developer("John", 50000, "Project A");
        developer.display();
        System.out.println();

        Programmer programmer = new Programmer("Doe", 60000, "Project B", "Java");
        programmer.display();
    }
}