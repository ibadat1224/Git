package overloading;

public class FinalInSwitch {

	public static void main(String[] args) {

		/// what are the data types can be used to switch
		// good: byte,short, int,String,char wrapper
		/// Bad: long, float, double,boolean

		int i = 10;
		final int j = 10;

		switch (i) {

		case 5:
			System.out.println("it is less");
			break;

		case j:
			System.out.println("it is equal");
			break;
		case 12:
			System.out.println("it is more");
			break;

		}

	}

}
