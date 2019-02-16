package wrapper;

import java.util.ArrayList;

public class ArrayListMethod {

	public static void mani(String[] args) {
		ArrayList<String> lst = new ArrayList<>();
		// List<Strin'g> lst2=new ArrayList<>();
		lst.add("John");
		lst.add("Adam");
		lst.add("John");
		lst.add("Adam");

		boolean itemExist = lst.contains("adam");
		System.out.println("item adam exists in the list : " + itemExist);

		int indexOfItem = lst.indexOf("Adam");
		int lastIndexOfItem = lst.lastIndexOf("Adam");

		System.out.println("First index of adam :" + indexOfItem);
		System.out.println("Last index of adam :" + indexOfItem);

		for (int i = 0; i < lst.size(); i++) {
			String item = lst.get(i);
			lst.set(i, item.toUpperCase());

		}
		lst.add(2, "ABC");
		lst.remove(0);
		lst.remove("ADAM");

		System.out.println(lst);
		lst.clear();
		System.out.println("is this list empty : " + lst.isEmpty());
		System.out.println(lst);

	}
}
