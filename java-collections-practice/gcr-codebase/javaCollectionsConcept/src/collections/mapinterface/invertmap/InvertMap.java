package collections.mapinterface.invertmap;

import java.util.*;
public class InvertMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<Character,Integer> hm=new HashMap<>();
        hm.put('A', 1);
        hm.put('B', 2);
        hm.put('C', 1);
        hm.put('D', 2);
        hm.put('E', 3);
        
        Map<Integer,List<Character>> invertedMap=new HashMap<>();
        for(char key:hm.keySet()) {
        	int val=hm.get(key);
        	if(invertedMap.containsKey(val)) {
        		List<Character> list=invertedMap.get(val);
        		list.add(key);
        		invertedMap.put(val,list);
        	}else {
        		List<Character> list=new ArrayList<>();
        		list.add(key);
        		invertedMap.put(val, list);
        	}
        }
        System.out.println(invertedMap);
	}

}
