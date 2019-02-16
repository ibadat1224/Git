package overloading;

public class IPhoneDealer {

	public static void main(String[] args) {
		// IPhone p1 = new IPhone("apple",5.7);
		// IPhone p2 = new IPhone("apple",4.7);
		//
		IPhone p2 = new IPhone(4.7);
		System.out.println(p2.brand);
		System.out.println(IPhone.PLATFORM);

	}

}
