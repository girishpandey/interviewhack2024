package com.gcp.dsalgo.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int sum=0, count=0;
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	sum = target - nums[i];
            count = i;
        	if(hm.containsKey(sum)){
            	break;
            }
        	hm.put(nums[i], i);
        }
        int[] arr = new int[] {hm.get(sum),count};
        return arr;
    }
}
