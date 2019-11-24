package day3;

public class thisasMethodArgument {
	
	private void method1 (thisasMethodArgument e) {
		
			
		System.out.println( " Calling the This argument ");
		
	}
	
	public void method2 () {
		
		method1 (this);
		
			}
	public static void main(String[] args) {
		
		thisasMethodArgument th = new thisasMethodArgument();
		th.method2();
		
	}
	
	

}
