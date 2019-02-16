package today;

public class Array {

	public static void main(String[] args) {
		int num1 = 12;
		int[] nums = new int[3];

		char[] chars = new char[2];
		// System.out.println(chars[0]);
		Long[] longNums = new Long[16];
		longNums[0] = (long) 4;
		longNums[1] = (long) 14;
		longNums[2] = (long) 24;
		longNums[3] = (long) 34;
		longNums[4] = (long) 44;
		System.out.println(longNums.length);

		// System.out.println(longNums[0]);
		// System.out.println(longNums[1]);
		// System.out.println(longNums[2]);
		// System.out.println(longNums[3]);
		// System.out.println(longNums[4]);

		for (int i = 0; i < longNums.length; i++) {
			System.out.println("item number :" + (i + 1) + "--" + longNums[i]);
		}

	}

}
