package day3;

public class invokecurrentclassconstructor {
	
	
	 invokecurrentclassconstructor (){
	 
	 System.out.println(" This is default constructor"); }
	 
	invokecurrentclassconstructor (int x){
		
		this();
		System.out.println( " this is prametrized constructor " + " and the value is " + x);
		
	}
	
	public void displayThiskeyword() {
		
		 //this(x); 
		//can we parametrized this constructor?
		// this () -this method can only be called in constructor 
		System.out.println(" hi this is sabya here");
	}
	
	public static void main(String[] args) {
		
		invokecurrentclassconstructor i = new invokecurrentclassconstructor(7);
		
	}

}
