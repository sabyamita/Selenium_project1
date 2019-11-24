package day3;

public class stud {
	
	int rollno;
	String name;
	float fee;
	
	/*
	 * stud (int rollno, String name , float fee){
	 * 
	 * rollno = rollno; name = name; fee = fee; // here the local variable is assigning 
	 * to local variable , so the out put for all the time is default value
	 * variable comes as null. }
	 */
	
stud (int rollno, String name , float fee){
		
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
		// here the local variable is assigning to instance variable , so out will comes as instance variable. 
}
	
	public void displayDet() {
		System.out.println(  rollno + "  "+ name + "  " + fee);
	}
	
	private void methodone() {
		
		System.out.println(" Hi I am method one");
	}
	
	public void methodtwo() {
		this.methodone();
	}

}
