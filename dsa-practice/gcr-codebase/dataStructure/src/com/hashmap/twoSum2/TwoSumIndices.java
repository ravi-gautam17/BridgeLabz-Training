package com.hashmap.twoSum2;
import java.util.*;

public class TwoSumIndices {

	public static int[] twoSum2(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}	
		return new int[] {}; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4, 2, 5, 1, 3, 0};
		int[] ans = twoSum2(nums, 11);
	}

}
