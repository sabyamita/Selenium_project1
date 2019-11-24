package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class student {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" please enter how many subject are there ");
		
		int numofsub = Integer.parseInt(br.readLine());
		
		// store the subject mark in to 1 D array
		
		int [] marks = new int [numofsub];
		for (int i =0 ; i<numofsub; i ++ ) {
			System.out.println(" Please enter mark of the student");
			marks [i] = Integer.parseInt(br.readLine());
		}
		int j = 1;
		// display the marks 
		
		for (int i : marks) {
			System.out.println(" marks obtain by student from subject " + j + " =" + i);
			j+=1;
			
		}
		
		// Find total mark of student
		
		int totalmark =0;
		
		for ( int i = 0 ; i < numofsub ; i ++) {
			totalmark = totalmark + marks[i];
			
		}
		System.out.println(" total mark of the student " + totalmark);
		
		// total percentage 
		
		System.out.println(" total percentage of the student is " + totalmark/numofsub);

	}

}
