package day1;

public class Aareofrectangle {
	
	int length , breadth , area;
	
	void calculateAareofrectangle (int l , int b) {
		
		length = l;
		breadth= b;
		area = (length * breadth );
		
	}
	void displayAareofrectangle() {
		System.out.println(" Area of the rectangle is "+ " =" + area );
	}

}
