package LabAssignments;

public class A1SAQ4 {
	int dd,mm,yyyy;
	public  A1SAQ4() {
		dd=22;
		mm=04;
		yyyy=2002;
		System.out.println(+dd+"/"+mm+"/"+yyyy);
	}
	public  A1SAQ4(int x,int y,int z) {
		this.dd=x;
		this.mm=y;
		this.yyyy=z;
		System.out.println(+dd+"/"+mm+"/"+yyyy);
	}
	public static void main(String[] args) {
		A1SAQ4 a=new A1SAQ4 ();
		A1SAQ4 a1=new A1SAQ4 (2,12,2002);
	}

}
