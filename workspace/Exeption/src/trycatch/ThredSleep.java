package trycatch;

public class ThredSleep {

	public static void main(String[] args) {

		System.out.println("begining");

		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			System.out.println("interrupted exxception");
		}
		System.out.println("end");
	}

}