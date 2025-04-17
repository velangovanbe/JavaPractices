package javaCore;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHandling {

	public static void main(String[] args) {
		
	try {
		FileReader file = new FileReader("java.txt");
		
		//String content=file.read();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
