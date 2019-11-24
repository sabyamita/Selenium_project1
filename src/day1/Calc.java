package day1;

public class Calc {

	int A;
	int B;

	int Add, mul;

	void addNumber(int x, int y) {

		A = x;
		B = y;
		Add = (A + B);

	}

	void displayAddition() {
		System.out.println(" My Addition =" + Add);
	}

	void mulNumber(int x, int y) {
		A = x;
		B = y;
		mul = (A * B);
		
		
		}
	void displayMultiplication() {
		System.out.println("my multiplication =" + mul);
	}

}
