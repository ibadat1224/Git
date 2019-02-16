package packagegetter;

public class Artists {

	private String name;
	private int songCount;

	public String getName() {
		return name;

	}

	public void setName(String newName) {
		name = newName;
	}

	public int getSongCount() {
		return songCount;
	}

	public void setSongCount(int newCount) {
		songCount = newCount;
	}

	public void displayInfo() {
		System.out.println("Artist [name = " + name + ",songCount = " + songCount + " ]");
	}
}
