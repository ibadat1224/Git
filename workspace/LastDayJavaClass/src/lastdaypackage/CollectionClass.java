package lastdaypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CollectionClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<String> names = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			names.add(scan.nextLine());

		}
		Set<String> set = new HashSet<>(names);
		System.out.println(set.size());

		int aaaFrecquency = Collections.frequency(names, "aaa");

	}
}
