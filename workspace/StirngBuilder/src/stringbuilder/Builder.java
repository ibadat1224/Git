package stringbuilder;

//java.lang package---no import needed=if you do nothing happens(but compiles)
public class Builder {

	public static void main(String[] args) {
		// creating stringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("ADFG");
		sb.append("RGF");
		sb.append(12343);
		sb.append(true);
		// turning stringBuilder to String
		String content = sb.toString();
		System.out.println(content);
		// creating stringBuilder with initial string value
		StringBuilder sb1 = new StringBuilder("ABCDEFGHIJKLMN");

		StringBuilder sb2 = new StringBuilder();
		// delete stringBuilder String value with beginning and ending value
		sb1.delete(0, 2);
		System.out.println(sb1);
		// delete
		StringBuilder sb3 = new StringBuilder();
		sb3.append("I ").append("Love ").append("Java ").append("I ").append("Will ").append("Work in ").append(3)
				.append(" Month");
		System.out.println(sb3);

		sb3.delete(8, 11);
		System.out.println(sb3);

		sb3.deleteCharAt(5);
		System.out.println(sb3);

		sb3.deleteCharAt(25);
		System.out.println(sb3);

		int len = sb1.length();
		System.out.println(sb1);
		sb1.setLength(10);
		System.out.println(sb1);

		System.out.println(sb1.length());
		sb1.append("abc");

		// deleting index can not be out of range,ending index can
		sb3.delete(4, 100);
		System.out.println(sb3);

		sb1.insert(1, "EFG");
		System.out.println(sb1);

		int i = sb1.indexOf("EF");

		StringBuilder sb4 = new StringBuilder();
		sb4.append("I will study and ").append("get certified");
		System.out.println(sb4);
		int index = sb4.indexOf("and");
		sb4.insert(index, "hard ");
		System.out.println("-----replace---");

		sb4.replace(0, 1, "Ibadat");
		int indexOfGet = sb4.indexOf("get");
		sb4.insert(indexOfGet, "Ibadat Will ").append("!!!");
		System.out.println(sb4);

		// System.out.println(sb4.replace(0, sb4.length(), "><"));
		//
		int lastStudentIndex = sb4.lastIndexOf("Ibadat");
		System.out.println(lastStudentIndex);
		// 0123456
		// Ibadat will Ibadat should Ibadat can learn Java
		int indexOfFirst = sb4.indexOf("Ibadat");
		int indexOfSecond = sb4.indexOf("Student", indexOfFirst + 1);

		sb4.setCharAt(7, 'W');
		System.out.println(sb4);

		sb4.reverse();
		System.out.println(sb4);
	}

}
