package overloading;

public class WrapperParameter {

	public static void main(String[] args) {

		// X.parseX------> it will return primitive value
		// X.valueOf------>it will return wrapper object
		add(new Long("123"));
		add(Long.valueOf(123));
		add(123L);
		add(123);

		add(Integer.valueOf(123));

		int i1 = 10;
		long i3 = i1; /// auto box to int
		long l2 = i3; /// promote to long
		Long l1 = l2; /// autoboxed to long

	}

	public static void add(Long l) {

	}

	public static void add(long l) {

	}

}
