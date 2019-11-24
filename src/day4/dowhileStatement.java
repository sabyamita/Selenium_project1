package day4;

public class dowhileStatement {
	
	protected void tillten(int i) {
		
		do 
		{
			i ++;
			System.out.println(" Print the out put of the number is = " + i);
		}
		
		while (i<=9);
	}
	
	public static void main(String[] args) {
		dowhileStatement d1 = new dowhileStatement();
		d1.tillten(0);
		
	}

}
