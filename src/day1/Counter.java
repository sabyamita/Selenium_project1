package day1;

public class Counter {
	
	 static int counter = 1;
	
	public static void main(String args[])
	{
		Counter c=new Counter();
		int count=c.counter + 1;
		System.out.println(count);
		
		count=c.counter + 1;
		System.out.println(count);
		
	}

}
