package wrapper;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();

		lst.add("John");
		lst.add("Adam");
		lst.add("mike");
		System.out.println(lst);
		System.out.println(lst.get(2));

		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		for (String each : lst) {
			System.out.print(each);
		}

		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		// Integer num1 = new Integer(2);
		// lst2.add(num1);
		lst2.add(123);
		lst2.add(13);
		lst2.add(23);

		lst2.add(0, 1000);
		lst2.clear();
		System.out.println(lst2);

	}

}
