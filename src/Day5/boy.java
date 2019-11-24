package Day5;

public class boy extends human {
	
	public static void walk() {
		System.out.println("Boy walks");
	}
	
	public static void main(String[] args) {
		
		human h1 = new boy();
		h1.walk();
		human h2 = new human();
		h2.walk();
		
	}
	
	// this is Static binding

}
