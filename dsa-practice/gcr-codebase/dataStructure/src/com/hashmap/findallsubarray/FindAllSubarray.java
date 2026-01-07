package com.hashmap.findallsubarray;
import java.util.*;

public class FindAllSubarray {

	public static int findAllSubarraySumZero(int[] arr) {
		
		HashMap<Integer, Integer> mapp = new HashMap<>();
        int prefixSum = 0, count = 0;
        
        mapp.put(0, 1);
        
        for(int num: arr){
            prefixSum += num;
            
            if(mapp.containsKey(prefixSum)){
                count += mapp.get(prefixSum);
            }
            
            mapp.put(prefixSum, mapp.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 0, 7, 8, 0, 0};
		int subarray = findAllSubarraySumZero(arr);
		System.out.println(subarray);
	}

}
