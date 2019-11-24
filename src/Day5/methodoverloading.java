package Day5;

public class methodoverloading {
	
	// method over loading
	
	protected void area(int len, int bre) {
		
		int area = len*bre;
		System.out.println("Area of rectangle : " + area);
		
	}
	
	protected  void area (int radious) {
		
		int area = (int) (2*3.14*radious);
		System.out.println("Area of Circle : " + area);
		
	}
	
	
	
	public static void main(String[] args) {
		
		methodoverloading n1 = new methodoverloading();
		n1.area(23);
		n1.area(4, 6);
		
	}

}
