package com.leetcode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/*
Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, 
where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */

public class TwoSum {
	
	public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<numbers.length; i++)
		{
			//判断map中是否包含该数
			if(map.containsKey(numbers[i]))
			{
				return new int[] {map.get(numbers[i])+1, i+1};
			}
			else
			{
				//不包含，则将target与该数的差存入map,如果
				//map.containsKey(numbers[i]),该数即为所求
				map.put(target-numbers[i], i);
			}
		}
        return null;
    }
	
	@Test
	public void testSum()
	{
		int[] num = new int[] {9, 2, 7, 11, 15};
		int[] res = this.twoSum(num, 9);
		for(int i:res)
		{
			System.out.println(i);
		}
	}

}
