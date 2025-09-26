package LabAssignments;
import java.util.Scanner;
public class A1SBQ1 {
	private int n;
	public A1SBQ1() {
		n=0;
	}
	public A1SBQ1(int no) {
		n=no;
	}
	public void Isnegative(int n) {
		if(n<0) {
			System.out.println("No is negative.");
		}
	}
	public void Ispositive(int n) {
		if(n>0) {
			System.out.println("No is positive");
		}
	}
	public void Isodd(int n) {
		if(n%2!=0) {
			System.out.println("No is odd");
		}
	}
	public void Iseven(int n) {
		if(n%2==0) {
			System.out.println("No is even");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=s.nextInt();
		 A1SBQ1 a=new  A1SBQ1();
		 A1SBQ1 a1=new  A1SBQ1();
		 a1.Isnegative(n);
		 a1.Ispositive(n);
		 a1.Isodd(n);
		 a1.Iseven(n);
	}

}

