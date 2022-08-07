package test;

import domain.Animal;
import domain.Cat;
import domain.Fish;
import domain.Pet;
import domain.Spider;

public class TestAnimals {

	public static void main(String[] args) {
		Fish f = new Fish();
		Cat c = new Cat("Fluffy");
//		Animal a = new Animal(); compiler error , because Animal is abstract class
		Animal a = new Fish();
		Animal e = new Spider();
		
		Pet p = new Cat();
		
		f.play();
		c.play();
		//virtual method invocation
		e.eat();
		e.walk();
		
		a.walk();
	}

}
