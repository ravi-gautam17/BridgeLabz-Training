package JavaStreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LargeFileReader {
	public static void main(String[] args) throws IOException {
		String filepath = "buffered_copy.txt";
		
		BufferedReader bis = new BufferedReader(new InputStreamReader(new FileInputStream(filepath)));
		
		String line;
		while((line=bis.readLine())!=null) {
			if(line.toLowerCase().contains("error"))
				System.out.println(line);
		}
		
	}
}
