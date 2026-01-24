package collections.setinterface.findsubset;

import java.util.*;

public class FindSubsets {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>(
				Arrays.asList(1,2,3,4)
				);
		Set<Integer> subs=new HashSet<>(
				Arrays.asList(2,3)
				);
		for(int val:subs) {
			if(!set.contains(val)) {
				System.out.println("Not a subset");
				return;
			}
		}
		System.out.println("Subset");

	}

}
