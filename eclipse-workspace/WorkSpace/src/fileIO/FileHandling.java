package fileIO;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		//Create Folder using mkdir();
		//Create Sub Folder using mkdirs();
		//Creating File ----createNewFile();
		//Deleting file-----delete();
		//printing file name
		//Rename the file
//		File file=new File("C:\\Users\\Elangovan\\Desktop\\Robert\\Downey\\Neo");
//		boolean present=file.exists();
//		System.out.println("File not exists in this Location so :"+present);
//		if(present==false)
//			file.mkdirs();
//		
//		present=file.exists();
//		System.out.println("File is exists in this Location so :"+present);

		File file=new File("C:\\Users\\Elangovan\\Desktop\\Robert\\text.txt");
		boolean present =file.exists();
		if(present==false)
			try {
				boolean created=file.createNewFile();
				System.out.println("File created "+created);
			}
		catch(IOException io){
			io.printStackTrace();
	}
		//Rename  //printing file name
		File newName=new File("C:\\Users\\Elangovan\\Desktop\\Robert\\demo.txt");
		boolean renameSuccess=file.renameTo(newName);
		//System.out.println("Rename "+renameSuccess);
//		System.out.println(newName.getName());
//		System.out.println(newName.canExecute());
//		System.out.println(newName.canRead());
//		System.out.println(newName.canWrite());
		File files=new File("C:\\Users\\Elangovan\\Desktop\\Robert");
		String[] listOfFolderFiles=files.list();
		for (int i = 0; i < listOfFolderFiles.length; i++) {
			//System.out.println(listOfFolderFiles[i]);
		}
//		for(String s:listOfFolderFiles)
//			System.out.println(s);
		          
					//Listing Only . required file extension
		File[] list=files.listFiles();
		for(File f:list)
		{
			if(f.isFile())
			{
				String fileName=f.getName();
				int lastDot=fileName.lastIndexOf(".");
				String extension=fileName.substring(lastDot+1);
				if(extension.equals("txt"))
				//if(f.length()>500)
				f.delete();
				//	System.out.println(fileName +" :"+f.length());
			}
			//System.out.println(f);
		}	
}
}