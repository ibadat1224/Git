package mypakcage;

public class StaticImportExample {

	static String myAction;

	public static void main(String[] args) {
		doSomething();
		doSomethingElse(myAction);

		StaticImportExample s = new StaticImportExample();

		char[] action1 = null;
		System.out.println(action1);

	}

	private static void doSomethingElse(String myAction2) {
		// TODO Auto-generated method stub

	}

	private static void doSomething() {
		// TODO Auto-generated method stub

	}

}
