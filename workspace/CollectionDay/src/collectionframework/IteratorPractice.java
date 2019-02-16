package collectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorPractice {

	public static void main(String[] args) {

		Collection<Integer> items = new ArrayList<>();

		System.out.println(items.isEmpty());
		items.add(10);
		items.add(32);
		items.add(344);
		items.add(47);
		items.add(56);

		Iterator<Integer> iter = items.iterator();

		while (iter.hasNext()) {
			// System.out.println(iter.next());
			if (iter.next() > 100) {
				iter.remove();
				System.out.println();
			}
		}

		// System.out.println(iter.hasNext());
		// System.out.println(iter.next());
		// System.out.println(iter.next());
		// iter.remove();
		// System.out.println(items);
		//
		// // System.out.println(iter.next());
		// // System.out.println(iter.next());
		// // System.out.println(iter.next());
		//
	}

}
