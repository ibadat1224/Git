package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MapDay {

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

		System.out.println(longList);
		Set<Long> longSet = new HashSet<>();

		for (Long each : longList) {
			longSet.add(each);
		}

		System.out.println(longSet);
		SortedSet<Long> sSet = new TreeSet<>(longSet);

		System.out.println(sSet);
		// System.out.println(sSet.subSet(10L, 15L));
		// System.out.println(sSet.tailSet(12L));
		// System.out.println(sSet.headSet(10L));

		SortedSet<Long> tail = sSet.tailSet(15L);

	}

}