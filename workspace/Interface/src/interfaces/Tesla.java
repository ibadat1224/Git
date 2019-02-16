package interfaces;

public class Tesla extends Vehicle implements Autonomous {

	@Override
	public void selfDrive() {
		System.out.println("Tesla is in auto pilot auto");
	}

}
