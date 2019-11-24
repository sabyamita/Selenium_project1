package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class keyboad {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Please enter a char");

		// char ch = (char) br.read();
		// one charecter passed use the above code
		String name = br.readLine();

		// System.out.println(" you enter" + " " + ch);

		System.out.println(" your string that you passed is " + " " + name);

	}

}
