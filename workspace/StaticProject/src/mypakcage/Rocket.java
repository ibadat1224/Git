package mypakcage;

public class Rocket {

	private int power;
	String name;
	private int numberOfEngine;
	private boolean readyForLaunch;

	static int counter;
	static String LauchPad = "Cybertek LaunchPad";

	public Rocket(int power, String name, int numberOfEngine, boolean readyForLaunch) {
		this.power = power;
		this.name = name;
		this.numberOfEngine = numberOfEngine;
		this.readyForLaunch = readyForLaunch;
		counter++;

	}

	public void launch() {
		System.out.println("Launching " + toString());
	}

	public static void capsulate() {
		System.out.println("Reducing the wheight");
		counter++;

	}

	public String toString() {
		return "Rocket [power=" + power + ",name=" + name + ", numberOfEngine=" + numberOfEngine + ",readyForLaunch "
				+ readyForLaunch + " ]";
	}

	public boolean isReadyForLaunch() {
		return readyForLaunch;
	}

	public void setReadyForLaunch(boolean readyForLaunch) {
		this.readyForLaunch = readyForLaunch;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfEngine() {
		return numberOfEngine;
	}

	public void setNumberOfEngine(int numberOfEngine) {
		this.numberOfEngine = numberOfEngine;
	}

}
