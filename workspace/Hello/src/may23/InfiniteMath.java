package may23;

public class InfiniteMath extends ComplexMath implements Computable, Uncomputable {

	public static final double secret = 6;

	public static void main(String[] args) {

		long secret = 12;
		Math math = new InfiniteMath();
		System.out.println(math.secret);

		Uncomputable un = new InfiniteMath();
		System.out.println(un.secret);

		Computable com = new InfiniteMath();
		System.out.println(com.secret);

		ComplexMath comp = new InfiniteMath();
		System.out.println(comp.secret);
	}

}
