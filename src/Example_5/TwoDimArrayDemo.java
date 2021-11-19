package Example_5;

import java.util.Iterator;

/*
 * 1) Declare an array
2) insert values into array
3) Find size of an array( rows, columns)
4) read values from an array
 */

public class TwoDimArrayDemo {

	public static void main(String[] args) {

		/*
		 * int a[][]=new int [3][2];
		 * 
		 * a[0][0]=100; a[0][1]=200;
		 * 
		 * a[1][0]=300; a[1][1]=400;
		 * 
		 * a[2][0]=500; a[2][1]=600;
		 */

		int a[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };

		System.out.println(a.length);
		System.out.println(a[0].length);

		// classic for loop read data from 2 dim array

		/*
		 * for(int r=0;r<=a.length-1;r++)//0 ....3 { for(int
		 * c=0;c<=a[r].length-1;c++)//0 ...1 { System.out.println(a[r][c]); } }
		 */

		// enhanved for loop read values from 2 dim array

		for (int r[] : a) {
			for (int i : r) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		System.out.println("####################################");
		fillAndPrintAnArrayOfTwoDimentions();
	}

	// Fill and print an array of two dimentions

	static void fillAndPrintAnArrayOfTwoDimentions() {
		int b[][] = new int[3][2];
		int cont = 0;
		System.out.println("Rows:: " + b.length);
		System.out.println(b[0].length);
		
		// Fill the array		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = cont++;
			}			
		}
		
		//print the array
		for (int r[] : b) {
			for (int i : r) {
				System.out.print(i);
				System.out.print("|");
			}
			System.out.println();
		}
	}

}
