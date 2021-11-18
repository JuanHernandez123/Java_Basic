package Example_3;

public class ReverseNumber {
	public static void main(String args[]) {
		// Code explained::
		// When is implement this operation (number % 10), the result is the last digit of the number
		// Example: 12345 % 10 = 5
		// The result above is assigned to 'reverse' variable
		// When is divided the number / 10, as result is removed the last digit
		// Example: 12345 / 10 = 1234
		
		
		int number = 2345;
		int reverse = 0;

		while (number != 0) {	
			System.out.println("reverse * 10:: " + reverse * 10);
			reverse = reverse * 10;			
			System.out.println("reverse:: " + reverse);	
			System.out.println("number:: " + number);
			System.out.println("number % 10:: " + number % 10);
			System.out.println("reverse = reverse + number % 10:: " + (reverse + number % 10));	
			reverse = reverse + number % 10;
			System.out.println("reverse:: " + reverse);	
			System.out.println("number = number / 10:: " +  (number / 10));
			number = number / 10;			
			System.out.println("number:: " + number);
			System.out.println("reverse:: " + reverse);
			System.out.println("#############################################");
			System.out.println();
		}

		System.out.println("Reverse of the number is " + reverse);
		
		/*System.out.println("Reverse using StringBuffer:: "); 
		reverseString();
		reverseNumber();*/
		
	}

	//Using string Buffer
	public static void reverseString() {

		StringBuffer sbf = new StringBuffer("Geeksforgeeks!");
		System.out.println("String buffer = " + sbf);

		// Here it reverses the string buffer
		sbf.reverse();
		System.out.println("String buffer after reversing = " + sbf);

	}

	public static void reverseNumber() {
		StringBuffer sbf = new StringBuffer("1 2 3 4 5 6 7 8 9 10");
		System.out.println("String buffer  = " + sbf);

		// Here it reverses the string buffer
		sbf.reverse();
		System.out.println("String buffer after reversing = " + sbf);

	}
}
