package simplilearn.test;

import simplilearn.domain.Account;
import simplilearn.domain.Customer;

public class TestBanking {

	public static void main(String[] args) {

		System.out.println("Creating the customer Jane Smith");
		Customer theCustomer = new Customer("Jane", "Smith");

		System.out.println("Creating her account with a 500.00 balance");
		Account account = new Account(500.00);
		theCustomer.setAccount(account);

		System.out.println("Witdraw 150.00 :  " + account.withdraw(150.00));
		System.out.println("Deposit 22.50 : " + account.deposit(22.50));
		System.out.println("Withdraw 47.62 : " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00 : " + account.withdraw(400.00));

		System.out.println("Customer [" + theCustomer.getLastName() + "," + theCustomer.getFirstName()
				+ " ] has a balance of " + theCustomer.getAccount().getBalance());

	}

}
