package vararg;

public class VarArgPractice {

	public static void main(String[] args) {
		sum(5L);
		sum(2L, 3L, 5L, 6L, 7L, 8L);
		sum(3L, 4L, 5L, 7L, 8L, 1L, 2L, 8L, 9L, 6L);

		long[] nums = new long[] { 1, 2, 3 };
		sum(nums);

		sum(123.54, 1L, 3L, 4L);
		sum(123.54, 1L);
		sum(123.54, 1L, 3L);

	}

	public static void sum(long... numbers) {

		long sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

		}
		System.out.println("sum:" + sum);
	}

	public static void sum(double d, long... numbers) {

		long sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

		}
		System.out.println("sum:" + sum);
	}
	// public static void sum(long... numbers,int...k) {
	//
	// long sum = 0;
	//
	// for (int i = 0; i < numbers.length; i++) {
	// sum = sum + numbers[i];
	//
	// }
	// System.out.println("sum:" + sum);
	// }
}