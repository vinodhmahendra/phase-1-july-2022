package simplilearn.examples;

public class Loops {

	// declare an array of strings
	static private String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };

	public static void main(String[] args) {
		
		int index = 0;
		do {
			System.out.println(months[index]);
			index ++;
		}while ( index > months.length );
		
//		int[] numbers = {1,2,3,4,5,6};
//		int index = 0;
//		while ( index < numbers.length ) {
//			System.out.println(numbers[index]);
//			index ++;
//		}
//		System.out.println(months.length);
//		for ( int i = 0 ; i < months.length ; i++ ) {
//			System.out.println(months[i]);
//		}
//		for (String month : months) {
//			System.out.println(month);
//		}
	}
}
