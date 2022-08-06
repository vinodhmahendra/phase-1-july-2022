package simplilearn.examples;

public class Conditions {
	
	public static void main(String[] args) {
		int monthNumber = 8;
		
		if ( monthNumber >= 1 && monthNumber <= 3 ) {
			System.out.println("Your'e in Quater 1");
		}else if ( monthNumber >= 4 && monthNumber <= 6) {
			System.out.println("You're in Quarter 2");
		}else {
			System.out.println("You're not in the first half of the year");
		}
	}

}
