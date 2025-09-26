package Assignment33;

import java.io.*;
import java.util.Scanner;

public class A3SBQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "customers.dat";

        try {
            
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
            System.out.print("Enter number of customers: ");
            int n = sc.nextInt();
            sc.nextLine(); 

            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for Customer " + (i + 1));
                System.out.print("Customer ID: ");
                int c_id = sc.nextInt();
                sc.nextLine();

                System.out.print("Customer Name: ");
                String cname = sc.nextLine();

                System.out.print("Address: ");
                String address = sc.nextLine();

                System.out.print("Mobile No: ");
                String mobile_no = sc.nextLine();

                
                dos.writeInt(c_id);
                dos.writeUTF(cname);
                dos.writeUTF(address);
                dos.writeUTF(mobile_no);
            }
            dos.close();

           
            System.out.println("\nCustomer Details from File:");
            DataInputStream dis = new DataInputStream(new FileInputStream(fileName));

            while (dis.available() > 0) {
                int c_id = dis.readInt();
                String cname = dis.readUTF();
                String address = dis.readUTF();
                String mobile_no = dis.readUTF();

                System.out.println("\nCustomer ID: " + c_id);
                System.out.println("Name: " + cname);
                System.out.println("Address: " + address);
                System.out.println("Mobile No: " + mobile_no);
            }
            dis.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}