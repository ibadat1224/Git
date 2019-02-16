package collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {

		Set<Integer> numSets = new HashSet<>();

		HashSet<Integer> numSets2 = new HashSet<>();
		numSets.add(123);
		numSets.add(143);
		numSets.add(133);
		numSets.add(124);
		numSets.add(123);

		for (Integer each : numSets) {
			System.out.println(each);
		}
		Iterator<Integer> setIter = numSets.iterator();

		while (setIter.hasNext()) {

			Integer i = setIter.next();

			if (i > 100) {
				setIter.remove();
				System.out.println("Delated " + i);
			}
		}
		System.out.println(setIter.hasNext());
		System.out.println(numSets);
		// System.out.println(numSets);

	}

}
