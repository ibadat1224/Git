package arraylist;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		ArrayList days = new ArrayList();
		days.add("Mon");
		days.add("Tue");
		days.add("Wed");
		days.add("Thus");
		days.add("Fri");
		days.add("Sat");
		days.add("Sun");

		System.out.println(days);
		days.add("Fathers Day");
		days.add("Mothers Day");
		System.out.println(days);
		System.out.println("Today is  " + days.get(6));
		System.out.println("removing...");
		days.remove(8);
		// days.remove(7);
		System.out.println(days);

		String[] arrDays = new String[8];
		arrDays[0] = "Mon";
		arrDays[1] = "Tue";
		arrDays[2] = "Wed";
		arrDays[3] = "Thus";

		System.out.println("Everyday is  " + days.get(7));

	}

}
