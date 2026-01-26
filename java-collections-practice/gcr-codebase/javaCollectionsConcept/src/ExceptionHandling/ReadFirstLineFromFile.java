package ExceptionHandling;
import java.io.*;

public class ReadFirstLineFromFile {
	public static void main(String[] args) {
		
		String filepath = "file.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(filepath));) {
				String line = br.readLine();
				
				if(line==null)
					System.out.println("File is empty");
				else
					System.out.println("First line: "+line);
		}
		catch(IOException e) {
			System.out.println("File not found");
		}
	}
}
