package wrapper;

public class WrapperClass {

	public static void main(String[] args) {

		Byte bt1 = new Byte((byte) 123);
		Byte bt2 = new Byte("123");

		Short s1 = new Short((short) 2345);
		Short s2 = new Short("2345");

		Integer i1 = new Integer(1234);
		Integer i2 = new Integer("1234");

		Character c = new Character('c');

		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");

		Long l1 = new Long(2000l);
		Long l2 = new Long("2000");

		Float f1 = new Float(12.2f);
		Float f2 = new Float("12.2");

		Double d1 = new Double(3.34556);
		Double d2 = new Double("3.3445");

		Character x1 = 'c';
		int i = new Integer(12);

		float f = new Float(12.2f);
		Integer i3 = i;

		// String to primitives: X.parseX(str)
		boolean b = Boolean.parseBoolean("false");
		Boolean b3 = Boolean.valueOf("true");
		b3 = b;
		System.out.println(b + " " + b3);

		// Any type that not primitivr type is Reference type
		Boolean b5 = null;

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

		System.out.println(Character.isDigit('Z'));

		System.out.println(Character.isDigit('9'));

		// Boolean.parseBoolean("true"); Boolean.valueOf("False");
		// Byte.parseByte("1"); Byte.valueOf("1");
		// Short.parseShort("1"); Short.valueOf("1");
		// Integer.parseInt("1"); Integer.valueOf("1");
		//
	}

}
