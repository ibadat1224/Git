package array;

public class ReversingAnArray {

	public static void main(String[] args) {

		int[] nums = { 12, 32, 53, 74 };
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println(" reversed ");
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}

	}

}
