package readingfiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFileOldWay {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		// Closing the files without using the finally block
		// TRY_WITH RESOURSES
		//

		try (FileReader fr = new FileReader("Numbers.txt"); BufferedReader br = new BufferedReader(fr);)

		{

			String line = null;

			while ((line = br.readLine()) != null) {
				System.out.println(line);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}

		//
		// for (int i = 1; i <= 100; i++) {
		//
		// System.out.print(i + "-");
		// System.out.println(br.readLine());
		//
		// }
		// while loop!!!!1
		// if statement!!!!!1
		// if ((line = br.readLine()) != null) {
		//
		// System.out.println(line);
		// }
	}

}
