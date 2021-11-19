package Example_1;

import java.util.ArrayList;

public class exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverseAnString();
		// convertStringToArray();
		serieFibonachi();
	}

	public static void reverseAnString() {
		String str = "GeeksForGeeks";

		// Creating array of string length
		char[] ch = new char[str.length()];
		String chain = "";
		int flag = 0;

		// Copy character by character into array
		for (int i = str.length() - 1; i >= 0; i--) {

			ch[flag++] = str.charAt(i);
		}

		// Printing content of array
		for (char c : ch) {
			System.out.println(c);
			chain += c;
		}
		System.out.println(chain);
	}

	public static void convertStringToArray() {

		String str = "GeeksForGeeks";

		// Creating array of string length
		char[] ch = new char[str.length()];
		String chain = "";

		// Copy character by character into array
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}

		// Printing content of array
		for (char c : ch) {
			System.out.println(c);
			chain += c;
		}
		System.out.println(chain);
	}

	public static void serieFibonachi() {
		ArrayList<Integer> serie = new ArrayList<Integer>();	
		
		for (int i = 0; i < 100; i++) {
			
			if (serie.size() < 2) {
				serie.add(i);	
			}else {
				serie.add(serie.get(i-1) + serie.get(i-2));				
			}
			
		}		
		
		
		// Print the series
		for (int i : serie) {
			System.out.println("Series... " + i);
		}
	}

}
