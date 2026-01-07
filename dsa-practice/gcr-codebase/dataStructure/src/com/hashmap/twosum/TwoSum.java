package com.hashmap.twosum;
import java.util.*;

public class TwoSum {

	public static boolean twoSum(int[] arr, int target) {
		HashMap<Integer, Boolean> mapp = new HashMap<>();
        
        for(int num: arr){
            if(mapp.containsKey(target-num)){
                return true;
            }
            
            mapp.put(num, true);
        }
        return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, -1, 2, -3, 1};
		boolean ans = twoSum(arr, 4);
		System.out.print(ans);
		
	}

}
