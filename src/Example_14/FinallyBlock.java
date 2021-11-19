package Example_14;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Program started");

		int a = 100;

		try {	
			System.out.println(a / 0);
			try{				
				System.out.println(13 / 0);
			}catch (ArithmeticException e){
				System.out.println("ENTERED IN TO cATCH BLOCK (13 / 0)");
			}
		} catch (ArithmeticException e) {
			System.out.println("ENTERED IN TO cATCH BLOCK (a / 0)");
		} finally {
			System.out.println("ENTERED INTO FINALLY BLOCK");
		}

		System.out.println("Program exited");
	}

}
