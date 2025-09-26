package Assingnment2;

import Assignments2.CapitalString;

public class A2SAQ4 {
    private String name;
    private String city;

    public A2SAQ4 (String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void display() {
        CapitalString cs = new CapitalString();
        String capitalizedName = cs.capitalizeFirstLetter(name);
        System.out.println("Name: " + capitalizedName);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
    	A2SAQ4  p = new A2SAQ4 ("john", "pune");
        p.display();
    }
}