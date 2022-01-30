import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TestCSVParser {
  // Tests if the length of the parsed array is equal to what is expected
	@Test
	public void lengthTest() throws FileNotFoundException {
		CSVParser myCSVParser = new CSVParser();
		File csv = new File("alphabets.csv");
		ArrayList<String> actual = myCSVParser.readCsv(csv);
		ArrayList<String> expectedLength = new ArrayList<String>();
		
		for(int i=0;i<55;i++) {
			int temp = i;
			String s = String.valueOf(temp);
			expectedLength.add(s);
		}
		assertEquals(expectedLength.size(), actual.size());
	}
	
	// Tests if the parsed array is empty or not
	@Test
	public void emptyTest() throws FileNotFoundException {
		CSVParser myCSVParser = new CSVParser();
		File csv = new File("alphabets.csv");
		ArrayList<String> actual = myCSVParser.readCsv(csv);
		assertFalse(actual.isEmpty());
	}
	//Tests if the CSV parser correctly parses the english langage
	@Test
	public void parseTestEnglish() throws FileNotFoundException {
		CSVParser myCSVParser = new CSVParser();
		File csv = new File("alphabets.csv");
		ArrayList<String> actual = myCSVParser.readCsv(csv);
		ArrayList<String> expected = new ArrayList<String>(
			Arrays.asList("English", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
		assertArrayEquals(expected, actual);
		
		
	}
}
