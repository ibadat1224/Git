package finalmethod;

public class MathIntern {

	public static final double PI;
	public static int num;
	/// Static block will run only once when the class is loaded

	static {

		System.out.println("intern is doing intense research");
		PI = Math.PI;
		num = 1;
	}

	static {

		System.out.println("intern is done researching");
		num = 2;
	}
	static {

		System.out.println("intern is reall done researching");
		num = 3;
	}

	public static void main(String[] args) {
		System.out.println("Main started");
		MathIntern m1 = new MathIntern();
		MathIntern m2 = new MathIntern();
		System.out.println(num);
		System.out.println("Main ended");
	}

}
