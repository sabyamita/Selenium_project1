package day1;

public class employ {

	String name;
	int Empid;
	double Sal;

	employ(String a, int i, double f) {
		name = a;
		Empid = i;
		Sal = f;

	}
	
	employ (){
		
	}

	void display() {
		System.out.println(name + "  " + Empid + "  " + Sal);
	}

}
