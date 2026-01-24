package collections.mapinterface.mergemaps;

import java.util.HashMap;
import java.util.Map;

public class Merge2Maps {

	public static void main(String[] args) {
		 Map<Character,Integer> hm1=new HashMap<>();
	        hm1.put('A', 1);
	        hm1.put('B', 2);
	        hm1.put('C', 1);
	        hm1.put('D', 2);
	        hm1.put('E', 3);
	      Map<Character,Integer> hm2=new HashMap<>();
	        hm2.put('A', 1);
	        hm2.put('B', 3);
	        hm2.put('C', 1);
	      Map<Character,Integer> mergeMap=new HashMap<>();
          for(Map.Entry<Character,Integer> entry:hm1.entrySet()) {
        	  char key=entry.getKey();
        	  int val=entry.getValue();
        	  mergeMap.put(key,val);
          }
          for(Map.Entry<Character,Integer> entry:hm2.entrySet()) {
        	  char key=entry.getKey();
        	  int val=entry.getValue();
        	  mergeMap.put(key,val+mergeMap.get(key));
          }
          System.out.println(mergeMap);
	}

}
