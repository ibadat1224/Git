package finalmethod;

import java.util.ArrayList;

public class TestSum {

	public static void main(String[] args) {
		Sum sum = new Sum();

		if (sum.sumIt(10, 50) == 60) {
			System.out.println("Passs: sumIt(int,int) working as expexted");
		} else {

			System.out.println("Fail: sumIt(int,int) is NOT working as expexted");

		}
		if (sum.sumIt(6, 5, 10) == 21) {
			System.out.println("Passs: sumIt(int,int,int) working as expexted");
		} else {

			System.out.println("Fail: sumIt(int,int,int) is NOT working as expexted");

		}

		int[] intsArray = { 10, 20, 30, 40, 50 };

		if (sum.sumIt(intsArray) == 150) {
			if (sum.sumIt(10, 50) == 60) {
				System.out.println("Passs: sumIt(int,int) working as expexted");
			} else {
				System.out.println("Fail: sumIt(int,int) is NOT working as expexted");

			}
			ArrayList<Integer> numsList = new ArrayList<>();
			numsList.add(5);
			numsList.add(10);
			numsList.add(15);

			if (sum.sumIt(numsList) == 30) {
				System.out.println("Pass: sumIt(ArrayList<Integer>) is working as expected");
			} else {
				System.out.println("Fail sumIt(ArrayList<Integer>) is NOT working as expected");
			}

		}
	}
}