package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopingMap {

	public static void main(String[] args) {
		Map<String, String> jobMap = new HashMap<>();
		jobMap.put("SDET", "Vienna");
		jobMap.put("ManualTerster", "Fairfax");
		jobMap.put("DBA", "Herndon");
		jobMap.put("ScrumMaster", "Reston");
		jobMap.put("ProductOwner", "Fairfax");
		jobMap.put("ScrumMaster", "DC");

		System.out.println(jobMap);
		Set<String> keys = jobMap.keySet();
		//
		// for (String key : keys) {
		// System.out.println(key);
		// }
		// use iterator to loop through to set
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		keys.remove("productOwner");
		System.out.println(jobMap);

		Collection<String> allValues = jobMap.values();
		Iterator<String> it2 = allValues.iterator();
		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");

		}

		allValues.remove("Fairfax");
		System.out.println(jobMap);
	}

}
