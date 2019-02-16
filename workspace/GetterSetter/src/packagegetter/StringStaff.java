package packagegetter;

public class StringStaff {

	public static void main(String[] args) {

		String s1 = "Adam";
		String s2 = "Adam";

		String s3 = new String("Adam");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s2 + " ");
		System.out.println(s1 == "Ad" + "am");
		String s4 = "Ad";
		String s5 = "am";
		System.out.println(s1 == s4 + s5);
	}

}
