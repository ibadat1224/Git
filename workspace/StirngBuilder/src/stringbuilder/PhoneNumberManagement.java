package stringbuilder;

public class PhoneNumberManagement {

	private long phoneNumber;
	private String name;

	public PhoneNumberManagement(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public PhoneNumberManagement(long phoneNumber, String name) {
		this.phoneNumber = phoneNumber;
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;

	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String transformPhoneNumber() {
		String strNum = "" + phoneNumber;
		// 1231237616->""+phoneNumber
		return strNum.substring(0, 3) + "-" + strNum.substring(3, 6) + "-" + strNum.substring(6);
	}

}
