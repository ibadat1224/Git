package packagegetter;

public class StringReplace {

	public static void main(String[] args) {
		// String wrongStatement = "String is not immutable";
		// String correctStatement = "";
		//
		// // String[] words = wrongStatement.split(" ");
		// correctStatement = wrongStatement.replace(" not", "");
		// System.out.println(correctStatement);
		//
		// correctStatement = wrongStatement.replace(" not immutable", " NOT
		// IMMUTABLE");
		// System.out.println(correctStatement);

		StudentOnline online = new StudentOnline("Adam ", 101);
		System.out.println(online);
		System.out.println(online.toString());
	}

}
