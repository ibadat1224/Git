package audio;

public class Song {

	private String name;
	private String authour;

	public Song(String name, String authour) {

		this.name = name;
		this.authour = authour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthour() {
		return authour;
	}

	public void setAuthour(String authour) {
		this.authour = authour;
	}

}
