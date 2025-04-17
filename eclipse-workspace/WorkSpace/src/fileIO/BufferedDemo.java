package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\Elangovan\\Desktop\\Robert\\text.txt");
		FileWriter fWriter;
		try {
			fWriter = new FileWriter(file,true);
			BufferedWriter bWriter=new BufferedWriter(fWriter);
		//	bWriter.write("Tamil Learning");
			//bWriter.newLine();
			//bWriter.write("Restrospective in Agile methodology is Called Looking Back on the Sprint, WhichMeans Team members What they did in their StoryPoint");
			//bWriter.newLine();
			//bWriter.write("Hello World");
			bWriter.flush();
			bWriter.close();
			FileReader fReader = new FileReader(file);
			BufferedReader bReader = new BufferedReader(fReader);
			String line=bReader.readLine();
			int lineCount=0;
			int sentencesCount=0;
			int wordsCount=0,charCount=0;
			while(line!=null) {
				//Sentence ,words,lines,characters count by Regex
				String[] sentence=line.split("[.]");
				sentencesCount=sentencesCount+sentence.length;
				String[] words=line.split(" ");
				wordsCount=wordsCount+words.length;
				charCount=charCount+line.length();
				System.out.println(line);
				lineCount++;
				line=bReader.readLine();  //Read until end of the Last line or if not infinity may occur by these loop 
			}
			System.out.println("No.of Line "+lineCount);
			System.out.println("No.of Sentences "+sentencesCount);
			System.out.println("No.of words "+wordsCount);
			System.out.println("No.of characters "+charCount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
