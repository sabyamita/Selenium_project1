package day3;

public class B {
	
	A objectofA;
	
	B(A objectofA){
		
		this.objectofA =objectofA;
	}
	
	void disPlay() {
		System.out.println( " object of " + objectofA.data);
	}

}
