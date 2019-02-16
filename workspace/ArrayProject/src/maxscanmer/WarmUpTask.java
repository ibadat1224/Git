package maxscanmer;

public class WarmUpTask {

	public static void main(String[] args) {
		int[] days = { 4, 5, 0, 2, 6, 6, 3, 1 };
		int count = 0;

		for (int day : days) {

			switch (day) {
			case 0:
				System.out.println("Sunday");
				count++;
				break;
			case 1:
				System.out.println("Monday");
				break;

			case 2:
				System.out.println("Tuesday");
				break;

			case 3:
				System.out.println("Wednesday");
				break;

			case 4:
				System.out.println("Thursday");
				break;

			case 5:
				System.out.println("Friday");
				break;

			case 6:
				System.out.println("Saturday");
				count++;
				break;
			default:
				System.out.println("Unkown day");
				break;

			}
			// System.out.println(" We have " + count + " weekends");
			// System.out.println(day);
			// if (day == 0) {
			// System.out.println("Sunday");
			// } else if (day == 1) {
			// System.out.println("Monday");
			// } else if (day == 2) {
			// System.out.println("Tuesday");
			// }

		}
		System.out.println(" We have " + count + " weekends");
	}

}
