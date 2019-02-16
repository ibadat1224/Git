package overloading;

public class Method {

	public static void main(String[] args) {

		int i = 6;
		byte b = (byte) i;

		byte b1 = 7;
		add((byte) 6);
		add(b);
		add(b1);
		short s1 = add(1234);
		int s2 = add(100);

		short s3 = 123;
		add(s3);

		byte b2 = (byte) 167;
		System.out.println(b2);
	}

	static void add(byte b) {

	}

	public static short add(int k) {

		short s = (short) k;
		return s;
	}

}
