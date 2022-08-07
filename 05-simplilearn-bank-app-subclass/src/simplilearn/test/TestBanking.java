package simplilearn.test;

import simplilearn.domain.Account;
import simplilearn.domain.Bank;
import simplilearn.domain.CheckingAccount;
import simplilearn.domain.Customer;
import simplilearn.domain.SavingsAccount;

public class TestBanking {

	public static void main(String[] args) {
		Bank bank = new Bank();
		Customer customer;
		Account account;

		System.out.println("creating the  Jane Smith");
		bank.addCustomer("Jane", "Smith");
		customer = bank.getCustomer(0);
		System.out.println("creating her savings account with a 500.00 balance and 3% interest");
		customer.setAccount(new SavingsAccount(500.00, 0.03));

		System.out.println("creating the customer Owen Bryant.");
		bank.addCustomer("Owen", "Bryant");
		customer = bank.getCustomer(1);
		System.out.println("crating his checking account with a 500.00 balance and no overdraft protection");
		customer.setAccount(new CheckingAccount(500.00));

		System.out.println("creating the customer Tim Soley");
		bank.addCustomer("Tim", "Soley");
		customer = bank.getCustomer(2);
		System.out.println("creating his checking account with a 500.00 balance and 500.00 in overdraft protection.");
		customer.setAccount(new CheckingAccount(500.00, 500.00));

		System.out.println("creating the customer Maria Soley.");
		bank.addCustomer("Maria", "Soley");
		customer = bank.getCustomer(3);
		System.out.println("Maria shares her checking account with her husband Tim.");
		customer.setAccount(bank.getCustomer(2).getAccount());

		System.out.println();
		System.out.println("========================");
		// Test a standard Savings Account
		System.out.println("Retriving the customer Jane Smith with her saving account");
		customer = bank.getCustomer(0);
		account = customer.getAccount();
		// perform some account transaction
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		// print out the final account balance
		System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName()
				+ " ] has a balance of " + account.getBalance());
		
		System.out.println();
		System.out.println("Retriving the customer Owen Bryant with her checking account with no overdraft protection");
		customer = bank.getCustomer(1);
		account = customer.getAccount();
		// perform some account transaction
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		// print out the final account balance
		System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName()
				+ " ] has a balance of " + account.getBalance());
		
		
		System.out.println();
		System.out.println("Retriving the customer Tim Soley with his checking account that has overdraft protection");
		customer = bank.getCustomer(2);
		account = customer.getAccount();
		// perform some account transaction
		System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
		System.out.println("Deposit 22.50: " + account.deposit(22.50));
		System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
		System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
		// print out the final account balance
		System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName()
				+ " ] has a balance of " + account.getBalance());
		
		System.out.println();
		System.out.println("Retriving the customer Maria Soley with her joint checking account with husband Tim");
		customer = bank.getCustomer(3);
		account = customer.getAccount();
		// perform some account transaction
	
		System.out.println("Deposit 150.00: " + account.deposit(150.00));
//		System.out.println("Withdraw 750.00: " + account.withdraw(750.00));
		System.out.println("Withdraw 100.00: " + account.withdraw(100.00));
		// print out the final account balance
		System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName()
				+ " ] has a balance of " + account.getBalance());


	}

}
