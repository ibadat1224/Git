package readingfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFileDataIntoAList {

	static List<Integer> nums = new ArrayList<>();

	public static void main(String[] args) {

		try (FileReader fr = new FileReader("Numbers.txt"); BufferedReader br = new BufferedReader(fr);)

		{

			String value;

			while ((value = br.readLine()) != null) {
				nums.add(Integer.valueOf(value));
				// System.out.println(value);
			}

		} catch (IOException e) {
			e.printStackTrace();

		}
		System.out.println("Number of lines : " + nums.size());

		int sum = 0;
		for (Integer number : nums) {
			sum = sum + number;

		}
		System.out.println("Sum : " + sum);
		int max = nums.get(0);

		for (int i = 1; i < nums.size(); i++) {
			if (nums.get(i) > max) {
				max = nums.get(i);
			}
		}
		System.out.println("Max with for loop: " + max);

		Collections.sort(nums);
		System.out.println("Max with for loop : " + nums.get(nums.size() - 1));

		System.out.println("Collections.max(): " + Collections.max(nums));

		List<Integer> newList = new ArrayList<>();
		int duplicates = 0;
		for (Integer number : nums) {
			if (!newList.contains(number)) {
				newList.add(number);

			} else {
				duplicates++;

			}
		}
		System.out.println("Count of unique nums : " + newList.size());
		System.out.println(newList.toString());
		System.out.println(duplicates);
	}

	public void checkForDuplicates() {
		return;
	}

}
