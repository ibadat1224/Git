package interfaces;

public class Main {

	public static void main(String[] args) {
		Tesla tesla = new Tesla();
		Honda honda = new Honda();
		tesla.start();
		tesla.accelerate();
		tesla.park();
		tesla.selfDrive();
		Autonomous.selfPark();

	}

}
