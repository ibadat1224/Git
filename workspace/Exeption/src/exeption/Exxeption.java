package exeption;

public class Exxeption {

	public static void main(String[] args) {
		System.out.println("Beginning of programm");

		int i = 6;
		int j = 0;

		try {
			System.out.println(i / j);
		} catch (ArithmeticException e) {
			System.out.println(" can not be devide by 0");
		}
		System.out.println("End of programm");
	}

}