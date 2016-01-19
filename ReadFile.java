package wxyctool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	private String path;
	
	public ReadFile(String file_path){
		path = file_path;
	}
	
	public String[] OpenFile() throws IOException{
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		int num = readLines();
		String[] textData = new String[num];
		
		int i; 
		
		for(i = 0; i < num; i++){
			textData[i] = textReader.readLine();
		}
		
		textReader.close();
		return textData;
	}
	
	int readLines() throws IOException {
		
		FileReader file_to_read = new FileReader(path);
		BufferedReader bf = new BufferedReader(file_to_read);
		
		String aLine;
		int numberOfLines = 0;
		
		while ((aLine = bf.readLine()) != null){
			numberOfLines++;
		}
		bf.close();
		
		return numberOfLines;
		
	}
	
	
}
