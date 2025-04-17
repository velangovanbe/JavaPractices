package fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyImage {

	public static void main(String[] args) {
		try {
			InputStream input = new FileInputStream("C:\\Users\\Elangovan\\Desktop\\Video.mp4");
			OutputStream output = new FileOutputStream("C:\\Users\\Elangovan\\Desktop\\VideoCopy.mp4");

			int content = input.read();
			while (content != -1) { // correct condition
				output.write(content);
				content = input.read();
			}

			output.flush();
			input.close();
			output.close();

			System.out.println("Image copied successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
