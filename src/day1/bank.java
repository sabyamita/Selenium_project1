package day1;

public class bank {
	
	double currentbalance , availablebalance , withdraw, deposite, amount, withdrawlbalance;
	
	
	bank (double m, double wit ,double cur ){
		amount = m;
		currentbalance =cur;
		withdraw =wit;
			
	}
	
	void AvailableBalance() {
		
		availablebalance =currentbalance + amount ;
		
	}
	
	void withdrawBalnace () {
		withdrawlbalance = availablebalance - withdraw;
	}
	
 void displayDeposite() {
	 System.out.println(" My deposite amount is " + " =" + amount);
 }
 void displayAvailableBalance() {
	 System.out.println(" My AvailableBalance amount is " + " =" + availablebalance);
 }
	
 void displaywithdrawBalnace() {
	 System.out.println(" My acoount Balnace left out is " + " =" + withdrawlbalance);
 }
 
 void displaywithdraw() {
	 System.out.println(" My withdraw amount is " + " =" + withdraw);
 }
}
