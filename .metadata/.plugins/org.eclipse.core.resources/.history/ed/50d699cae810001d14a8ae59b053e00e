package simplilearn.domain;

public class Account {
	
	private double balance;
	
	public Account(double initialBalance) {
		if (initialBalance > 10) {
			balance = initialBalance;
		}else {
			System.err.println("the balance can't be less than 10$");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		balance = balance + amt;
	}
	
	public void withdraw (double amt) {
		if ( amt <= balance ) {
			balance = balance -amt;
		}
	}

}
