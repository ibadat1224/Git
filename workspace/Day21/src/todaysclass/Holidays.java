package todaysclass;

import java.util.ArrayList;
import java.util.List;

public class Holidays {
	private List<String> holidays;

	public Holidays() {
		holidays = new ArrayList<>();
		holidays.add("New Year");
		holidays.add("Eid");
		holidays.add("Mothers Day");
		holidays.add("Fathers Day");
		holidays.add("MLK Day");
		holidays.add("Labor Day");

	}

	public boolean isHoliday(String holidayName) {
		return holidays.contains(holidayName);
	}

	public static void main(String[] args) {
		Holidays holidays = new Holidays();
		// check mothers day
		if (holidays.isHoliday("Mothers Day")) {
			System.out.println("Mothers Day is a holiday");
		} else {
			System.out.println("Mothers Day is not a holiday");
		}
		String h = "Independence Day";
		System.out.println(h + " is a holiday?-->" + holidays.isHoliday(h));

	}

}
