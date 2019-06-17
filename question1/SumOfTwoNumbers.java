package com.xth.question1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SumOfTwoNumbers {
//	给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//	你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
//	来源：力扣（LeetCode）
//	链接：https://leetcode-cn.com/problems/two-sum
	public static void main(String[] args) {
		int[] x = {3,2,4};
		int[] answer = twoSum(x, 6);
		System.out.println("answer[0]:"+answer[0]);
		System.out.println("answer[1]:"+answer[1]);
	}
    public static int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    
    }
}
