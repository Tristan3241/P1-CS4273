import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVParser {
	public static void main(String[] args) {
		File csv = new File("alphabets.csv");
		System.out.println(csv.getAbsolutePath());
		if (csv.exists()) {
			try {
				ArrayList<String> elements = readCsv(csv);
				
				for(String s : elements) {
					System.out.println(s);
				}
			} catch (Exception e) {
				System.out.println("Failed to read the csv file");
			}
		} else {
			System.out.println("No file found");
		}
	}

	private static ArrayList<String> readCsv(File csv) throws FileNotFoundException {
		Scanner scanner = new Scanner(csv);
		ArrayList<String> elements = new ArrayList<String>();
		while (scanner.hasNextLine()) {
			String currLine = scanner.nextLine();
			String[] lineElements = currLine.split(",");
			for(String s : lineElements) {
				elements.add(s);
			}
		}
		
		scanner.close();
		return elements;
	}
}
