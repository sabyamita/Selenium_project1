package day3;

public class thisConstructor {
	
	int rollno;
	String name , course;
	float fee;
	
	thisConstructor (int rollno, String name , String course){
		
		this.rollno=rollno;
		this.name=name;
		this.course= course;
		
	}
	
	thisConstructor ( int rollno, String name , String course , float fee){
		
		this(rollno,name , course);
		this.fee=fee;
		
	}
	
	public void displayCon() {
		System.out.println( "roll num is " + rollno + " " + "name is " + name + " Course is "+ course + " amount is" +" ="+  fee);
	}
}
