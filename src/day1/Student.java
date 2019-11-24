package day1;

public class Student {
	
	int id ;
	String name;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Sabya = new Student();
		//  new Student(); is the object 
		// Sabya is called as object reference name
		
		Student Priya = new Student();
		
		Sabya.id= 25;
		Sabya.name= "Tanya";
		
		//Here we are initialize by refernece name 
		
		Priya.id=123;
		Priya.name="Manu";
		
		System.out.println(Sabya.id);
			
		System.out.println(Sabya.name);
		
		 System.out.println(Sabya.id+" "+Sabya.name);
		 
		 System.out.println(Sabya.id + "  " + Priya.id + Sabya.name );
		 
		 // initialize through method 
		 
		 
		}
		
		
		

	}


