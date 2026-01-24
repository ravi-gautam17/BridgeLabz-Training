package collections.listinterface.findNthElement;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FindNthFromEnd {
   public static void main(String[] args) {
	   List<Character> list=new ArrayList<>(
			   Arrays.asList('A','B','C','D','E')
			   );
		int n=2;
		for(int i=list.size()-1;i>=0;i--) {
			if(--n==0) {
				System.out.println(list.get(i));
				break;
			}
		}
	   
   }
}
