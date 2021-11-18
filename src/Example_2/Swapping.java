package Example_2;

public class Swapping {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp;

		System.out.println("Before Swap:");
		System.out.println("a is :" + a);
		System.out.println("b is :" + b);

		// Usign temporary variable
		// temp=a;
		// a=b;
		// b=temp;

		// without using temporary varaible
		a = a + b; // 30
		b = a - b; // 10
		a = a - b; // 20

		System.out.println("After Swap:");
		System.out.println("a is :" + a);
		System.out.println("b is :" + b);

	}

}
