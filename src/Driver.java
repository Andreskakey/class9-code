import java.io.*;
import java.util.StringTokenizer;

public class Driver {

	public static void main(String[] args) {
		try {
			printWhen("gutenberg.txt",new StartWithT());
		} catch (IOException e) {
			System.err.println("OOPSie: problems reading the file.");
		}

	}

	public static void printWhen(String filename, CheckStrategy which) throws IOException 
	{	
		BufferedReader infile = new BufferedReader(new FileReader(filename)); // a decorated FileReader!
		String buffer = null;
		while((buffer = infile.readLine()) != null) {							// read in a line of text
			StringTokenizer words = new StringTokenizer(buffer);				// chop it up into words
			while( words.hasMoreTokens() ) {									// test each word
				String word = words.nextToken();
				if (which.check(word)) {
					System.out.println(word);
				}
			}
		}
		infile.close();
	}
}
