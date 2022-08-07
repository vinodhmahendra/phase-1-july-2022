package simplilearn.test;

public class TestArrays {

	public static void main(String[] args) {
		// Declare an array of int
		int[] array1 = {2,3,5,7,11,13,17,19};
		int[] array2;
		
		System.out.print("array1 is : ");
		printArray(array1);
		System.out.println();
		array2 = array1;
		
		//modify array2
		array2[0] = 0;
		array2[2] = 2;
		array2[4] = 4;
		array2[6] = 6;

		//print array1
		System.out.print("array1 is : ");
		printArray(array1);
		System.out.println();
		
	}

	private static void printArray(int[] array1) {
		for ( int index = 0; index < array1.length ; index++) {
			System.out.print(array1[index] + " ");
		}
		
	}

}
