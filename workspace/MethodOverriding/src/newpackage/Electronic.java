package newpackage;

public class Electronic {
	public boolean isOn;

	public boolean getIsOn() {
		return isOn;
	}

	public void turnOn() {
		this.isOn = true;
		System.out.println("Electronic turned onn");
	}

	public void turnOff() {
		this.isOn = false;
		System.out.println("Electronic turned off");
	}
}
