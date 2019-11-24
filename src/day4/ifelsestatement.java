package day4;

public class ifelsestatement {

int age;
		 
		public void ageofVoting(int a) {
			age=a;
			
			if (a>= 18) {
				System.out.println(" Person is eligble for voting");
			}
			else {
				System.out.println("Person is not eligble for voting ");
			}
		}
		
		public static void main(String[] args) {
			ifelsestatement i = new ifelsestatement();
			i.ageofVoting(10);
			
			
		}

	}


