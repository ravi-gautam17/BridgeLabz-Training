package collections.listinterface.rotateElements;

import java.util.*;

public class RotateElements {
  public static void main(String[] args) {
	  int k=2;
	  List<Integer> list=new ArrayList<>(
			  Arrays.asList(10,20,30,40,50,60,70)
			  );
	  int n=list.size();
	  List<Integer> rotatedList=new ArrayList<>();
	  for(int i=k;i<n;i++) {
		 rotatedList.add(list.get(i));
	  }
	  for(int i=0;i<k;i++) {
		  rotatedList.add(list.get(i));
	  }
	  System.out.println(list);
	  System.out.println(rotatedList);
	  
	}	
  }