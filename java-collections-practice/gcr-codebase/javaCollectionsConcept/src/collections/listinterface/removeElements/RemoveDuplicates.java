package collections.listinterface.removeElements;

import java.util.*;

public class RemoveDuplicates {
  public static void main(String[] args) {
	  List<Integer> list=new ArrayList<>(
			   Arrays.asList(3,1,2,2,3,4)
			  );
	  List<Integer> newList=new ArrayList<>();
	  for(int val:list) {
		  if(!newList.contains(val)) {
			  newList.add(val);
		  }
	  }
	  System.out.println(newList);
	  
  }
}
