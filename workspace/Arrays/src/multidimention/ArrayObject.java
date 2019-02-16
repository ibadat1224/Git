package multidimention;

import java.util.Arrays;

public class ArrayObject {

	public static void main(String[] args) {

		int[][] nums = new int[2][4];
		System.out.println(nums[0][0]);
		System.out.println(nums[2][4]);
		System.out.println(nums[1][0]);

		System.out.println(Arrays.deepToString(nums));

		int[][] nums1 = new int[2][];
		System.out.println(Arrays.deepToString(nums1));

	}

}
