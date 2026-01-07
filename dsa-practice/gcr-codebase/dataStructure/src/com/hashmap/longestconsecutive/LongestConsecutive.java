package com.hashmap.longestconsecutive;
import java.util.*;

public class LongestConsecutive {

	  public static int longestConsecutive(int[] nums) {
	        HashMap<Integer, Boolean> mapp = new HashMap<>();

	        for(int num: nums){
	            mapp.put(num, true);
	        }

	        int longest = 0;
	        for(int num: nums){

	            if(!mapp.containsKey(num - 1)){
	                int currNum = num;
	                int length = 0;

	                while(mapp.containsKey(currNum)){
	                    length++;
	                    currNum++;
	                }
	                longest = Math.max(longest, length);
	            }
	        }
	        return longest;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,4,200,1,3,2};
		int longest = longestConsecutive(arr);
		System.out.println(longest);
	}

}
