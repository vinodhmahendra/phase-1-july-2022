package simplilearn.test;

import simplilearn.domain.Bank;
import simplilearn.domain.Customer;

public class TestBanking {

	public static void main(String[] args) {
		
		// create an object of Bank
		Bank myBank = new Bank();
		
		myBank.addCustomer("Simms", "Jane");
		myBank.addCustomer("Bryant", "Owen");
		myBank.addCustomer("Soley", "Tim");
		myBank.addCustomer("Soley", "Maria");
		
		for ( int index = 0 ; index < myBank.getNumberOfCustomers() ; index++) {
			Customer theCustomer = myBank.getCustomer(index);
			
			System.out.println("Customer [" + (index+1) + " ] is " + theCustomer.getLastName() + " , " + theCustomer.getFirstName());
			
		}
		
		
	}

}
