package JavaStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class ConvertUpperToLower {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("Lower.txt"));
		
		String line;
		
		while((line=br.readLine())!=null) {
			String[] words = line.split(" ");
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                if (i > 0) sb.append(" ");
                sb.append(words[i].toLowerCase());
            }

            bw.write(sb.toString());
            bw.newLine(); 
		}
		br.close();
		bw.close();
		System.out.println("File converted to uppercase");
	}
}
