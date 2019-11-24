package day4;

import java.util.Scanner;

public class scannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" please enter the details of the person");
		
		String name = sc.next();
		float sal = sc.nextFloat();
		int id = sc.nextInt();
		
		System.out.println(" Name of the person is " + name + "  "+ " Salary of the person is "+" "+ sal + "  " + " Id of the person is  " + id);

	}

}
