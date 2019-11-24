package day3;

public class testThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stud s1 = new stud(112," tanya", 123);
		stud s2 = new stud (132 ," lipi " , 987);
		s1.displayDet();
		s2.displayDet();
		s1.methodtwo();
		
		invokecurrentclassconstructor i = new invokecurrentclassconstructor(13);
		thisConstructor t = new thisConstructor(112, "Tanya", "eng",1234);
		t.displayCon();
		
		thisasMethodArgument th = new thisasMethodArgument();
		th.method2();
		

	}

}
