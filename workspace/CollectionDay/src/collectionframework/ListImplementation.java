package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListImplementation {

	public static void main(String[] args) {
		//
		// // List<Integer> items = new ArrayList<Integer>();
		// Collection<Integer> items = new ArrayList<>();
		// items.add(1);
		// items.add(2);
		// items.add(3);
		// items.add(4);
		// items.add(5);
		//
		// List<Integer> ls1 = Arrays.asList(22, 33, 555, 66);
		// items.addAll(ls1);
		// System.out.println(items);
		// items.removeAll(ls1);
		// System.out.println(items);
		//
		// List<Integer> ls2 = Arrays.asList(22, 43, 5, 76);
		//
		// items.retainAll(ls2);
		// System.out.println(items);
		//
		// // items.remove(1);
		// // items.remove(1);
		// System.out.println(items);

		Collection<String> str = new ArrayList<>();
		str.add("Hello");
		str.add("Bye");

		ArrayList<String> str1 = new ArrayList<>();
		str.addAll(str1);
		System.out.println(str);

		str.removeAll(str1);
		System.out.println(str1);

		List<String> str2 = Arrays.asList("aaa", "Hello", "bbb");

		System.out.println(str);
		str.retainAll(str2);
		System.out.println(str);
	}

}