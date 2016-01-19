package wxyctool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Parser {

	public static void main(String[] args) throws IOException {
		
		String file_name = "/Users/lsward/Desktop/LocalBandsCSV.txt";
		String nufile_name = "/Users/lsward/Desktop/LocalBandsComa.txt";
		
		WriteFile writer = new WriteFile(nufile_name, true);
		try {
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			
			ParseString aParser = new ParseString(aryLines);
			aryLines = aParser.removeBS();
			
			int i;
			for(i = 0; i < aryLines.length; i++){
				System.out.println(aryLines[i]);
				writer.writeToFile(aryLines[i]);
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
