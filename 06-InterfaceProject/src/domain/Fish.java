package domain;

public class Fish extends Animal implements Pet {

	private String name;

	public Fish() {
		super(0);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String n) {
		this.name = n;
	}

	@Override
	public void play() {
		System.out.println("Fish swim in their tanks all day.");
	}

	@Override
	public void walk() {
		super.walk();
		System.out.println("Fish, of course , cant walk; they swim.");
	}
	@Override
	public void eat() {
		System.out.println("Fish eat pond scum.");
	}

}
