package packagegetter;

import java.util.Random;

public class RAndomItemFromArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 234, 45, 67, 56, 76, 567, 54, 554 };
		Random r = new Random();
		int randomNum = r.nextInt(nums.length);
		System.out.println(nums[randomNum]);

	}

}
