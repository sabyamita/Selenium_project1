package day2;

public class rect {

	private int length;
	private int height;

	public rect() {
		System.out.println("It is defult constructor");
	}

	private int areaOfRectangle(int l, int b) {
		length = l;
		height = b;
		return length * height;
	}

	public void displayArea(int l, int b) {
		System.out.println("Area of rectangle " + this.areaOfRectangle(l, b));
	}
	
	public int rectangleValue(int i, int k) {
		return this.areaOfRectangle(i,k);
		
	}
	
	public static void main(String[] args) {
		
		rect r1 = new rect () ;
		System.out.println(r1.rectangleValue(12, 10));
		r1.displayArea(16, 10);
		
	}

}
