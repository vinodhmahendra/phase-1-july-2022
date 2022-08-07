package domain;

public class Spider extends Animal {

	public Spider() {
		super(8); // invoke a super class(Animal) constructor
	}
	
	//define a abstract method from super class 
	public void eat() {
		System.out.println("The spider eats a fly.");
	}
}
