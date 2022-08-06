package simplilearn.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
	
	public static void main(String[] args) {
		String s1 = getInput("Enter a numeric value: ");
		String s2 = getInput("Enter a numeric value: ");
		
		double d1 = Double.parseDouble(s1);//String is transformed to double
		double d2 = Double.parseDouble(s2);
		
		double result = addTwoValues(d1,d2);
		System.out.println("The answer is : " + result);
		
		double resultOfMultiple = addMultipleValues(1,2,3,4,5);
		System.out.println("The answer from multiple values is " + resultOfMultiple);
	}
	
	private static double addMultipleValues(double... values) {
		double result = 0;
		for ( double d : values) {
			result += d; // result = result + d
		}
		return result;
	}

	private static double addTwoValues(double d1, double d2) {
		return d1 + d2;
	}

	private static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		}catch (Exception e) {
			return "Error: " +e.getMessage();
		}
	}

}
