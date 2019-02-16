package overloading;

public class FinalVariable {
	int k;
	static long j;

	public static void main(String[] args) {

		final int i = 10;
		final double price = 4.2;
		final String finalName = "Abc";

		String name = finalName;
		name = "efg";
		System.out.println(finalName);

		final StringBuilder sb = new StringBuilder("adam");
		// sb= new StringBuilder();
		sb.append("zzz");

		System.out.println(sb);
	}

}
