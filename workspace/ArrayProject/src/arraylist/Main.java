package arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Bag<Integer> bag = new Bag<>();
		ArrayList<Integer> a = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			bag.add(i * 10);
			a.add(i);
		}
		for (int i = 0; i <= 1000; i++) {
			System.out.println(bag + ",");
		}
	}

}
