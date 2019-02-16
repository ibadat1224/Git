package packagegetter;

public class ArtistRunner {

	private static Artists a3;

	public static void main(String[] args) {
		Artists a1 = new Artists();

		a1.setName("Michal");
		a1.setSongCount(1000);

		Artists a2 = new Artists();
		a2.setName("Jay Z");
		a2.setSongCount(56);

		Artists a3 = new Artists();
		a3.setName("Jack");
		a3.setSongCount(300);

		Artists[] topArtists = { a1, a2, a3 };
		for (Artists artist : topArtists) {
			artist.displayInfo();

		}
	}

}
