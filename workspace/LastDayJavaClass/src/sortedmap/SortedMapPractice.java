package sortedmap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapPractice {

	public static void main(String[] args) {

		// HashMap<Integer, String> cityMap = new HashMap<>();

		SortedMap<Integer, String> cityMap = new TreeMap<>();

		// add few items and iterate over

		cityMap.put(15, "Fairfax");
		cityMap.put(20, "Arlington");
		cityMap.put(30, "Crafton");
		cityMap.put(62, "Oakland");
		cityMap.put(56, "Robinson");

		System.out.println(cityMap);

		// Map is not Iterable
		// We need to get Collection view
		// map.keySet() map.values() map.entrySet()

		// for (Integer key : cityMap.keySet()) {
		// System.out.println("Map key: " + key);
		// }
		//
		// for (String each : cityMap.values()) {
		// System.out.println("Map value: " + each);
		// }
		//
		// for (Entry<Integer, String> eachEntry : cityMap.entrySet()) {
		// System.out.println(eachEntry.getKey() + "--" + eachEntry.getValue());
		// }

	}

}
