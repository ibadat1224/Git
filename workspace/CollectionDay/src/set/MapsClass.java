package set;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsClass {

	public static void main(String[] args) {

		Map<String, Integer> phoneNumbers = new HashMap<>();

		phoneNumbers.put("Esen", 412506088);
		phoneNumbers.put("sn", 32149999);
		System.out.println("ending");
		System.out.println("Esen");
		System.out.println("Hi");
		System.out.println(phoneNumbers);

		// phoneNumbers.keySet();
		Set<String> keys = phoneNumbers.keySet();
		for (String key : keys) {
			System.out.println(keys);
		}

	}

}
