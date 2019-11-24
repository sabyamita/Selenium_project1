package day1;

public class TestStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentMe s1 = new StudentMe();

		StudentMe s2 = new StudentMe();

		s1.insertRecord(111, "Karan");
		s1.insertRecord(333, "Tanya");
		s2.insertRecord(222, "Aryan");

		s1.displayInformation();

		s2.displayInformation();
		
		

	}

}
