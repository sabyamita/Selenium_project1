package Day5;

public class employ {
	
	String EmpName;
	Address empAdd;
	
	employ ( String EmpName , Address empAdd){
		this.EmpName=EmpName;
		this.empAdd=empAdd;
		
	}
	
	public static void main(String[] args) {
		employ emp = new employ("Hari Das", new Address(708, "Bhubaneswa", "Odisha", "India"));
		System.out.println("Name employ : "+ emp.EmpName);
		System.out.println("City of the employ : " + emp.empAdd.Cityname); // here employ class has a relation ship with address class , any change in Address class is not any impact in employ
		
	}

}
