package Day5;

public class teacher {
	
	String teachername;
	String Designation;
	String Subject;
	Address teacherAdd;
	
	teacher (String teachername, String Designation , String Subject , Address teacherAdd){
		
		this.teachername=teachername;
		this.Designation=Designation;
		this.Subject=Subject;
		this.teacherAdd=teacherAdd;
		
	}
	
	public static void main(String[] args) {
		
		Address ad = new Address( 8, "Bangalore","Karnataka","India");
		teacher t1 = new teacher("Rama Das", "Math teacher", "Math", ad);
		System.out.println("Name : " + t1.teachername);
		System.out.println("Designation : "+ t1.Designation);
		System.out.println("City of the teacher : " + t1.teacherAdd.Cityname);
		System.out.println("Country :" + t1.teacherAdd.Country);
		
	}
	

}
