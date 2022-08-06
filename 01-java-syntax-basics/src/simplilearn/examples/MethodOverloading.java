package simplilearn.examples;

public class MethodOverloading {

	public static void main(String[] args) {
		
		addValue(10,20);
		addValue(10,20,30);
		addValue("10","10");

	}

	private static void addValue(String x, String y) {
		String concate = x + y;
		System.out.println(concate);
	}

	private static void addValue(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println("Sum = " + (x+y+z));
	}

	private static void addValue(int x, int y) {
		int sum = x + y;
		System.out.println("Sum = " + (x+y));
	}

}
