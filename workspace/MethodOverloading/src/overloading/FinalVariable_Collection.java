package overloading;

import java.util.Arrays;

public class FinalVariable_Collection {

	public static void main(String[] args) {
		final int[] nums = new int[] { 1, 2, 3, 4, 5 };
		nums[0] = 12;
		nums[1] = 20;

		// nums=new int[] {12,23,45}; // will not work

		System.out.println(Arrays.toString(nums));

	}

}
