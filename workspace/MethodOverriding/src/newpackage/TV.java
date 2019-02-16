package newpackage;

public class TV extends Electronic {

	public static void main(String[] args) {
		TV mine = new TV();
		mine.turnOn();
		System.out.println("-------");
		mine.turnOff();
	}

	@Override
	public void turnOn() {
		this.isOn = true;

		System.out.println("TV is turned on");
	}

	@Override
	public void turnOff() {
		super.turnOff();
		System.out.println("TV is turned off");
	}

}
