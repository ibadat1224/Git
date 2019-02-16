package lastdaypackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Adam", "Dave", "Bob", "Adam", "Bob");

		Collections.sort(names);
		System.out.println(names);
		Map<String, Integer> freMap = new HashMap<>();

		for (String each : names) {
			freMap.put(each, 1);
			if (!freMap.containsKey(each)) {
				freMap.put(each, 1);

			} else {
				int existingCount = freMap.get(each);
				freMap.put(each, existingCount + 1);
			}
		}
		System.out.println(freMap);
	}

}
