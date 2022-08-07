package simplilearn.domain;

public class Bank {
	//Association (one-to-many)
	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank() {
		//create an array of customers
		customers = new Customer[10];
		numberOfCustomers = 0;
	}
	
	public void addCustomer(String firstName,String lastName) {
		int i = numberOfCustomers++;
		//create an object of customer and store in array
		customers[i] = new Customer(firstName, lastName);
	}
	
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int customer_index) {
		return customers[customer_index];
	}

}
