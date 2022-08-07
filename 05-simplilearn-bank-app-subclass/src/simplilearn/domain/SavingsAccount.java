package simplilearn.domain;

//savings account 'is-a' subclass of Account(super class)
public class SavingsAccount extends Account {
	
	//additional property
	private double interestRate; // instance variable
	
	// constructor from parent class is not inherited
	public SavingsAccount(double initBalance,double interestRate) {
		//invoke a super class (Account) constructor
		super(initBalance);
		//'this' keyword is solving name ambiguity
		this.interestRate = interestRate;
	}
}
