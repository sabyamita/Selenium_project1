package day4;

public class switchcase {

	public void verifyColour(String Col) {

		switch (Col) {
		case "r":
			System.out.println(" Col is red");
			break;
		case "B":
			System.out.println(" Col is blue");
			break;
		case "y":
			System.out.println(" col is yellow");
			break;
		default:
			System.out.println(" it is different color ");

		}

	}

	public static void verifyday(String day) {
		switch (day) {
		case "sun":
			System.out.println(" It is sunday");
			break;
		case "mon":
			System.out.println(" It is monday");
			break;
		case "tue":
			System.out.println("it is tuesday");
			break;
		case "thu":
			System.out.println(" it is thursday");
			break;
		case "fri":
			System.out.println(" it is friday");
			break;
		case "sat":
			System.out.println(" it is saturday");
			break;
		default:
			System.out.println("please enter a valid day");
			break;
		}
	}

	public static void main(String[] args) {
		switchcase s1 = new switchcase();
		s1.verifyColour("l");
		s1.verifyday("mon");

	}
}
