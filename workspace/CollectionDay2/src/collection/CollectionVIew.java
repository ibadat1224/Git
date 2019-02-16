package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionVIew {

	public static void main(String[] args) {

		List<Long> longList = new ArrayList<>();

		longList.add(12L);
		longList.add(15L);
		longList.add(11L);
		longList.add(12L);
		longList.add(12L);
		longList.add(15L);
		longList.add(10L);
		longList.add(1L);
		longList.add(16L);
		//
		// Collections.sort(longList);
		// System.out.println(longList);
		SortedSet<Long> sSet = new TreeSet<>(longList);

		System.out.println(sSet);
		SortedSet<Long> tail = sSet.tailSet(15L);
		System.out.println(tail);
		tail.remove(15L);
		System.out.println(sSet);
		System.out.println(tail);
	}

}
