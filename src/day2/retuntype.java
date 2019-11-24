package day2;

public class retuntype {

	String name, Address;

	private String personinformtion(String n, String A, boolean requirename) {
		name = n;
		Address = A;
		return requirename ? name : Address;

	}

	private String detailinformtion(String n, String A) {
		name = n;
		Address = A;
		return "Name " + name + " " + ", Address of person " + Address;

	}

	public void displayPerson(String n, String A, boolean requirename) {
		System.out.println("Display information " + personinformtion(n, A, requirename));
	}

	public void displayFullDetails(String n, String A) {
		System.out.println("Display information " + detailinformtion(n, A));
	}

}
