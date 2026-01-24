package collections.setinterface.checksetequality;

import java.util.*;

public class CheckSetEquality {
  public static void main(String[] args) {
	  Set<Integer> set1=new HashSet<>(
			  Arrays.asList(1,2,3)
			  );
	  Set<Integer> set2=new HashSet<>(
			  Arrays.asList(3,2,2,1)
			  );
	  
	  if(set1.size()!=set2.size()) {
		  System.out.println("Unequal size");
		  return;
	  }
	  for(int val:set1) {
		  if(!set2.contains(val)) {
			  System.out.println("Unequal sets");
			  return;
		  }
	  }
	  System.out.println("Equal sets");
  }
}
