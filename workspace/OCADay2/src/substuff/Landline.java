package substuff;

import superstuff.Phone;

public class Landline extends Phone {

	public Landline() {
		this("Unkown", 0.0);

	}

	public Landline(String brand, double size) {
		super(brand, size);
		System.out.println(" 2 arg constractor from Landline");
	}

	public void makeCallFromLandLine() {
		makeCall();
		System.out.println("calling from Landline");
	}

}
