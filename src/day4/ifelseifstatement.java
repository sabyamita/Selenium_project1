package day4;

public class ifelseifstatement {
	
	int precentage;
	char ch;
	
	public void verifyPercentage (int p) {
		
		precentage=p;
		
		if (p >= 60) {
			System.out.println(" It is A division");
			
		}
		else if (p< 60 && p > 50) {
			System.out.println(" It is B division ");
		}
		
		else {
			System.out.println("It is C division ");
		}
		
		System.out.println(" End of the execution");
	}
	
	public void VerifyVowel(char c) {
		
		ch =c;
		if (c=='a' || c== 'e' || c=='i'|| c=='o' || c=='u') {
			System.out.println(" The char is a vowel");
			
		}
		else {
			System.out.println(" The char is not a vowel");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ifelseifstatement i = new ifelseifstatement();
		i.verifyPercentage(20);
		i.VerifyVowel('l');
		
	}

}
