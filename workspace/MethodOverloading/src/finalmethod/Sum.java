package finalmethod;

import java.util.ArrayList;

public class Sum {

	public int sumIt(int n1, int n2) {

		return n1 + n2;
	}

	public int sumIt(int n1, int n2, int n3) {

		return n1 + n2 + n3;
	}

	public int sumIt(int[] nums) {

		int sum = 0;
		for (int n : nums) {

			sum += n;
		}
		return sum;
	}

	public int sumIt(ArrayList<Integer> nums) {
		int sum = 0;
		for (int n : nums) {

			sum += n;
		}
		// for loop version:
		// for(int i=0; i<nums.size(); i++){
		//
		// sum += nums.get(i);
		//
		//
		// }

		return sum;
	}

}
