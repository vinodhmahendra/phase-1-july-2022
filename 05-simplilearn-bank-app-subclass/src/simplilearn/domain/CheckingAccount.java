package simplilearn.domain;

//sub class
public class CheckingAccount extends Account {
	
	private double overdraftAmount;

	//constructor #1
	public CheckingAccount(double initBalance, double overdraftAmount) {
		super(initBalance); // invoke parent class constructor
		this.overdraftAmount = overdraftAmount;
	}
	
	// in a class if there is more than one constructor  
	// constructor overloading
	
	//constructor #2
	public CheckingAccount(double initBalance) {
		this(initBalance,0.0);// invoke a constructor present in same class
	}
	
	@Override
	public boolean withdraw(double amt) {
		boolean result = true;
		
		if (balance < amt ) {
			double overdraftNeeded = amt - balance;
			if ( overdraftAmount < overdraftNeeded ) {
				result = false;
			}else {
				balance = 0.0;
				overdraftAmount -= overdraftNeeded;
			}
		}else {
			balance -= amt;
		}
		return result;
	}

}
