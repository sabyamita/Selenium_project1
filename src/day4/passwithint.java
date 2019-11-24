package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class passwithint {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println(" Please enter your number");
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 =Integer.parseInt(br.readLine());
		
		System.out.println(" number is "+ num1 + num2);
		System.out.println(" number is "+ (num1 + num2));
		
		
		
}}
