package collections.setinterface.unionintersection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionSets {
  public static void main(String[] args) {
	  Set<Integer> set1=new HashSet<>(
			  Arrays.asList(1,2,3));
	  Set<Integer> set2=new HashSet<>(
			  Arrays.asList(3,4,5));
	  
	  Set<Integer> union=new HashSet<>();
	  for(int val:set1) {
		  union.add(val);
	  }
	  for(int val:set2) {
		  union.add(val);
	  }
	  
	  System.out.println(union);
	  Set<Integer> intersect=new HashSet<>();
	  for(int val:set1) {
		  if(set2.contains(val)) {
			  intersect.add(val);
		  }
	  }
	  System.out.println(intersect);
	  
  }
}
