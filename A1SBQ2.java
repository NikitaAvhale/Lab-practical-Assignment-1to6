package LabAssignments;

public class A1SBQ2 {
	int salary;
	String name;
	
	A1SBQ2(int salary,String name){
		this.salary=salary;
		this.name=name;
	}
	public void display() {
		System.out.println("Name:"+name+"Salary"+salary);
	}
	public static void main(String[] args) {
		 A1SBQ2[] emp=new A1SBQ2[5];
		 emp[0]=new A1SBQ2(45000,"AAA");
		 emp[1]=new A1SBQ2(55000,"BBB");
		 emp[2]=new A1SBQ2(25000,"CCC");
		 emp[3]=new A1SBQ2(60000,"DDD");
		 emp[4]=new A1SBQ2(35000,"EEE");
		 for(int i=0;i<emp.length;i++) {
			 emp[i].display();
		 }
		 

	}

}
