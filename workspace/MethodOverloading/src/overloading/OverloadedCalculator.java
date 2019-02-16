package overloading;

public class OverloadedCalculator {

	public static void main(String[] args) {
		OverloadedCalculator o = new OverloadedCalculator();
		int result = o.add(10);
		System.out.println(result);

		o.add(1.5, 2.3f);
		int[] myArr = new int[] { 1, 2, 6, 4, 8 };
		int sumOfArray = o.add(myArr);
		System.out.println(sumOfArray);

		long[] longArr = new long[] { 100, 120, 21, 5 };
		long longSum = o.add(longArr);
		System.out.println(longSum);

	}

	public int add(int[] numbers) {
		int sum = 0;
		for (int eachNumber : numbers) {
			sum = sum + eachNumber;

		}

		return sum;

	}
	/// create another method, take long array
	/// and add all the numbers until any item is less than 20
	/// it should return sum

	public long add(long[] longs) {
		long sum = 0;
		for (int i = 0; i < longs.length; i++) {
			if (longs[i] < 20) {
				sum = sum + longs[i];

			}
		}

		return sum;

	}

	public int add(int num) {
		return num + num;

	}

	public void add(double d, float f) {
		double sum = d + f;
		System.out.println(sum);
	}

}
