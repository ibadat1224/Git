package stringbuilder;

public class AppRunner {

	public static void main(String[] args) {
		PhoneNumberManagement pm1 = new PhoneNumberManagement(1234567654L, "John");
		PhoneNumberManagement pm2 = new PhoneNumberManagement(1234567890L);
		String pm1Num = pm1.transformPhoneNumber();
		System.out.println(pm1Num);

		System.out.println(pm2.transformPhoneNumber());
	}

}
