package collections.listinterface.findfrequency;

import java.util.*;

public class FindFrequency {
  public static void main(String[] args) {
	  List<String> list=new ArrayList<>(
			  Arrays.asList("banana","apple", "banana","orange","apple","apple")
			 );
	  HashMap<String,Integer> frequencyMap=new HashMap<>();
	  for(String str:list) {
		  frequencyMap.put(str, frequencyMap.getOrDefault(str, 0)+1);
	  }
	  System.out.println(frequencyMap);
  }
}
