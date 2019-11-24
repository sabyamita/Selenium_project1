package Day3Task1;

public class Student {

	// static String School_name= "NIIT";

	String name;
	int rollno;
	float fees= 12 ;

	Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
		this.fees = fees;
	}

	public void displayStudentdetails() {

		System.out.println(" Name of the student is " + " " + name +"  " + "Roll number of the student is " +rollno + " "
				+ " Fee of the student " + fees);

	}

}
