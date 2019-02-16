package todaysclass;

import java.util.ArrayList;
import java.util.List;

public class CompareList {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);

		boolean equals = list1.equals(list2);
		System.out.println(equals);
		List<Double> d = new ArrayList();
		d.add(1325.65);
		d.add(10.90);
		if (d.contains(10.90)) {
			System.out.println("exist");
		} else {
			System.out.println("Does not exist");
		}

	}

}
