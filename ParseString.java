package wxyctool;

import java.io.IOException;

public class ParseString {
	String[] copy;
	
	public ParseString(String[] textString){
		copy = textString;
	}
	
	public String[] removeBS() throws IOException{
		int i;
		for(i = 0; i < copy.length - 1; i++){
			String temp = copy[i];
			temp = temp.replace('/', ',');
			copy[i] = temp;
		}
		return copy;
	}

}
