package stringbuilder;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIstClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lst = new ArrayList<>();
		System.out.println("Enter 5 names : ");

		for (int i = 0; i < 5; i++) {
			lst.add(sc.nextLine());

		}
		for (String name : lst) {
			System.out.println(name.charAt(0) + name.charAt(name.length() - 1));

		}
		//
		// for (int i = 0; i < lst.size(); i++) {
		//
		// }
		for (int i = 0; i < lst.size(); i++) {
			String item = lst.get(i);
			System.out.println(item.charAt(0) + " " + item.charAt(item.length() - 1));

		}
		boolean itemExist = lst.contains("adam");
		System.out.println("item adam exists in the list : " + itemExist);

		int indexOfItem = lst.indexOf("adam");
		int lastIndexOfItem = lst.lastIndexOf("adam");

		System.out.println("First index of adam :" + indexOfItem);
		System.out.println("Last index of adam :" + indexOfItem);

		lst.clear();

		// System.out.println(lst);
	}
}