package Day5;

public class callingInterface implements interfaceA , interfaceb {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
		System.out.println("chalo delhi");
		
	}
	
	public static void main(String[] args) {
		
		callingInterface c1 = new callingInterface();
		c1.walk();
		
	}
	
	

}
