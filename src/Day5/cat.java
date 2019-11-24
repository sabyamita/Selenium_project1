package Day5;

public class cat extends animal{
	
	@Override
	protected void sound() {
		System.out.println("mumum");
	} 
	
	public static void main(String[] args) {
		
		cat c1 = new cat();
		c1.sound();
		c1.eat();
		
	}

}
