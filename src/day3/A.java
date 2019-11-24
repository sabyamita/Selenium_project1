package day3;

public class A {
	
	int data =13;
	
	A () {
		
		B b1 = new B (this);
		//B b1 = new B ( new A ());
		
		b1.disPlay();
		
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		
	}

	
	

}
