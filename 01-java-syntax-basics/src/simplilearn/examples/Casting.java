package simplilearn.examples;

public class Casting {

	public static void main(String[] args) {
		int i1 = 56;
		long l1 = i1; //widening
		System.out.println("The result is :" +l1);
		
		long l2 = 56L;
//		int i2 = l2; compiler error
		int i2 = (int) l2; // narrowing
		System.out.println("The result is: " +i2);
		
		
		double d3 = 3.99999999d;
		int i3 = (int)d3;
		System.out.println("The result is :" + i3);
		
		int i4 = 129;
		byte b4 = (byte) i4;
		System.out.println("The result is :" +b4); 
		
		
		long l5 = 56L;
		float f5  = (float)l5;
		System.out.println("The result is " + f5);
		
		
		
		

	}

}
