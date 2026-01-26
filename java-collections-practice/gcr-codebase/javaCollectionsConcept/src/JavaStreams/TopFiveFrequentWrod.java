package JavaStreams;

import java.io.*;
import java.util.*;

public class TopFiveFrequentWrod {
	public static void main(String[] args) {
		
		String filepath = "file.txt";
		Map<String, Integer> freq = new HashMap<>();
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(filepath));
			
			String line;
			
			
			while((line = br.readLine())!=null) {
				String st[] = line.toLowerCase().replaceAll("[^a-zA-Z ]","").
						split("\\s+");
				
				for(String s:st) {
					if(!s.isEmpty())
					freq.put(s, freq.getOrDefault(s, 0)+1);
				}
			}
			
		}
		catch(IOException e) {
			System.out.println("Error occured: "+e.getMessage());
			return;
		}
		
		List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(freq.entrySet());
		
		sortedList.sort((a,b) ->b.getValue().compareTo(a.getValue()));
		System.out.println("Top 5 most frequent words:");
        for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
            Map.Entry<String, Integer> entry = sortedList.get(i);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
	}
}
