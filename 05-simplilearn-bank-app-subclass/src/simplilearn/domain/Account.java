package simplilearn.domain;

//super class
public class Account {
	
	protected double balance;
	
	protected Account(double initialBalance) {
		if (initialBalance > 10) {
			balance = initialBalance;
		}else {
			System.err.println("the balance can't be less than 10$");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amt) {
		balance = balance + amt;
		return  true;
	}
	
	public boolean withdraw ( double amt ) {
		boolean result = false ; //assume operation failure
		if ( amt <= balance ) {
			balance = balance - amt;
			result = true; // operation succeeds
		}
		return result;
	}

}
