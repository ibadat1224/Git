package review;

public class StringPractice {

	public static void main(String[] args) {
		String str = "JOB hunTER";

		System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		System.out.println(str.substring(3, 9));

		System.out.println(str.substring(0, 2) + str.substring(2, 3).toLowerCase().toLowerCase());
		System.out.println(str.substring(4, 10).toUpperCase());
	}

}
