package review;

public class StringPractice2 {

	public static void main(String[] args) {
		String str = "Nice Day"; // "NicE DaY"
		String str1 = str.substring(0, 3);
		String str2 = str.substring(3, 4);
		String str3 = str.substring(4, 7);
		String str4 = str.substring(7).toUpperCase();

		System.out.println(str1 + str2 + str3 + str4);
		System.out.println(str.substring(0, 3) + str.substring(3, 4).toUpperCase() + str.substring(4, 7)
				+ str.substring(7).toUpperCase());

		System.out.println(str.replace('e', 'E').replace('y', 'Y'));
	}

}
