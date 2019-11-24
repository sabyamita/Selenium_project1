package day2;

public class studentdetails {
	
	public static  String Collage_name ;
	public String Std_name ;
	//public static Collage_name = "";
	
	private String details(String s) {
		
		return " Student name " + Std_name + " College Name " + studentdetails.Collage_name ;
		
	}
	
	public void displayDetails (String s ) {
		System.out.println("student information  " + details(Std_name =s ) );
	}
	public static void collegename()
	{
		System.out.println("CollegeName :" + Collage_name);
	}
	
	public static void main (String args[]) {
		studentdetails.Collage_name ="ABCD";
		studentdetails ram= new studentdetails();
		
		ram.displayDetails("ram");
		studentdetails hari= new studentdetails();
		hari.displayDetails("Hari ");
		studentdetails.collegename();
	}

}
