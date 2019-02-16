package collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OtherConstractors {

	public static void main(String[] args) {

		List<String> ls = new ArrayList<>();
		ls.add("abc");
		ls.add("efg");
		ls.add("abc");

		List<String> ls2 = new ArrayList<>(ls);

		System.out.println(ls);
		System.out.println(ls2);

		// Set<String> set1 = new HashSet<>(ls);

		Set<String> set1 = new HashSet<>(ls);

		System.out.println(ls2);
	}

}
