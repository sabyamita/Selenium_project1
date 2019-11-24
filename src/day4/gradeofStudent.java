package day4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class gradeofStudent {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	protected void marksOfStudent(int i) {

		int[] marks = { 10, 20, 30, 40, 50, 60 };

		// int [] marks = Integer.parseInt(br.readLine());

		for (i = 0; i <= 5; i++) {
			System.out.println(" Marks of the Student is = " + marks[i]);
			// marks[i] ;
		}

	}

	protected void nameoftheStudent(int i) {
		// String [] name = br.readLine();

		String[] name = { "Rama", " Hari", "Sita", "Govinda", "Ravi", "Siva" };

		for (i = 0; i <= 5; i++) {
			// name[i];

			System.out.println(" Marks of the Student is = " + name[i]);
		}

	}

	public static void main(String[] args) {

		gradeofStudent g1 = new gradeofStudent();

		g1.marksOfStudent(0);
		g1.nameoftheStudent(0);

	}

}
