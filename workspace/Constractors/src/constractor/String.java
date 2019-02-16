package constractor;

public class String {

	public static void main(java.lang.String[] args) {

		java.lang.String strLiteral = "ABC"; // String LIteral
		String othernewStr = new String();
		String oneLastStr = othernewStr;
		java.lang.String anotherLiteral = "ABC"; // String Literal

		java.lang.String s5 = "pool";
		s5 = s5.concat("abc");
		System.out.println(s5);

		System.out.println(strLiteral == anotherLiteral);
		// System.out.println(strLiteral == othernewStr);

		char[] arr = { 'a', 'b', 'c' };
		String str3 = new String();

	}

}
