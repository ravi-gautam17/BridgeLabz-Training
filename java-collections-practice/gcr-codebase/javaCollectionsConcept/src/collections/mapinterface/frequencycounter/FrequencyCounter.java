
package collections.mapinterface.frequencycounter;

import java.util.HashMap;

public class FrequencyCounter {
   public static void main(String[] args) {
	   String str="Hello world, hello Java!";
	   str=str.toLowerCase();
	   
	   str=str.replaceAll("[^a-zA-Z ]","");
	   
	   String[] words=str.split("\\s+");
	   
	   HashMap<String,Integer> hm=new HashMap<>();
	   
	   for(String word:words) {
		   hm.put(word, hm.getOrDefault(word,0)+1);
	   }
	   System.out.println(hm);
   }
}
