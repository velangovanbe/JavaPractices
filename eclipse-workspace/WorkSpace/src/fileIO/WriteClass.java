package fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteClass {

	public static void main(String[] args) {
		File files=new File("C:\\Users\\Elangovan\\Desktop\\Robert\\text.txt");
//		boolean present=files.exists();
//		if(present==false)
		try {
		files.createNewFile();
		//files.delete();
			FileWriter write=new FileWriter(files); 
			write.write("Hey!");
			write.write(" Hello java"); 
			write.flush();
			write.close();
			//System.out.println(write);
			
			FileReader fileReader=new FileReader(files);
			//Count the character in the file
			char[]ch =new char[(int)files.length()];
		//	System.out.println(ch.length);
			
			//Read Char by char
			fileReader.read(ch);
			for(char ch1:ch) {
				System.out.print(ch1);
			}
			int output =fileReader.read();
			while(output!=-1) {
				//System.out.print((char)output);
				output=fileReader.read();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
