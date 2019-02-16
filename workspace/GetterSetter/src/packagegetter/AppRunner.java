package packagegetter;

public class AppRunner {

	public static void main(String[] args) {
		Artist tracker = new ArtistTracker();
		tracker.loadAllArtists();
		System.out.println("------display all of them----------");

		tracker.displayAllArtistInfo();
		System.out.println("------moreThan100----count----");

		int moreThan100Club = tracker.get.ArtistCountHaveMorethan100Song();
		System.out.println(moreThan100Club);

		Artists artist = new Artists();
		artist.setName("Sam Smith");
		artist.setSongCount(14);
		tracker.checkIfArtistAlreadyExists();

		System.out.println("------printNamesOfArtistsHave_N_Song----count----");
		tracker.printNamesOfArtistsHave_N_Song(29);
		
		System.out.println("-----getTotalSongCount------");
		long sumOfAll tracker.getTotalSongCount("Wiz Khalifa");
		
	}

}
