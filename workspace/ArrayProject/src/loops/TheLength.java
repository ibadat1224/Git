package loops;

public class TheLength {

	public static void main(String[] args) {
		String str = "abc";
		// change the value of abc to abcefg
		str += "efg";
		System.out.println(str);
		int[] ints = new int[7];
		double[] ds = new double[2];
		ds[0] = 12.2;
		ds[0] = 1.65;
		ds[1] += 3;
		System.out.println(ds[0]);
		System.out.println(ds[1]);

		// System.out.println(str.length());
		// System.out.println(ints.length);
		// System.out.println(ds[1]);
	}

}
