package collections.listinterface.reverselist;

import java.util.*;

public class ReverseLL {
	    public static void main(String[] args) {
	        LinkedList<Integer> list = new LinkedList<>(
	                Arrays.asList(1, 2, 3, 4, 5)
	        );

	        LinkedList<Integer> reversedList = new LinkedList<>();

	        for (Integer element : list) {
	            reversedList.addFirst(element);
	        }

	        System.out.println(reversedList);
	    }
	}


