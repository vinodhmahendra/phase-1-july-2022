package domain;

public abstract class Animal {
	
	//instance variable
	protected int legs;
	
	//constructor
	protected Animal(int legs) {
		this.legs = legs;
	}
	
	//abstract method
	public abstract void eat();
	
	// concrete method
	public void walk() {
		System.out.println("This animal walks on " +legs + " legs");
	}

}
