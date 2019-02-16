package lastdaypackage;

import java.util.Comparator;

public class LastCharComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.substring(o2.length() - 1).compareTo(o1.substring(o2.length() - 1));

	}

}