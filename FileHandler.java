package FileHandler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
	
	private String fileName;
	
	// Constructor
	public FileHandler() {
		this.fileName = "";
	}
	
	public void readFile(String fileName) throws IOException {
		String line = null;
		
		try {
			// FileReader reads text files in the default encoding;
			FileReader fileReader = new FileReader(fileName);
			
			// Always wrap FileReader in BufferedReader;
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			
			// Always close files;
			bufferedReader.close();
		} catch(FileNotFoundException fnfex) {
			System.out.println("Unable to open file '" + fileName + "'");
			fnfex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		
	}
	
}
