package com.leetcode;

import java.util.Arrays;

import org.junit.Test;

/*
Given a string, find the length of the longest substring without repeating characters. 
For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LengthOfLongestSubstring {
	
	@Test
	public void testLeng()
	{
		System.out.println(lengthOfLongestSubstring("ddaddd"));
	}

	/**
	 * 最长连续不重复子序列长度
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
		int[] res = new int[s.length()];
		int start = 0;
		res[0] = 1;
		for(int i=1; i<s.length(); i++)
		{
			int id = s.substring(start, i).lastIndexOf(s.charAt(i));
			if(id>=0)
			{
				//如果遇到与前面重复的字符，则从重复字符开始重新开始计数
				res[i] = i-(id+start);
				start = id+start;
			}
			else
			{
				res[i] = res[i-1] + 1;
			}
		}
		//对结果数组排序
		Arrays.sort(res);
		return res[res.length-1];
    }
	
	/**
	 * 子序列无连续最大长度
	 * @param s
	 * @param begin
	 * @return
	 */
	public int diffLen(String s, int begin)
	{
		if(begin == s.length()-1)
			return 1;
		if((s.substring(begin+1).indexOf(s.charAt(begin)))>=0)
		{
			return diffLen(s, begin+1);
		}
		else
		{
			return diffLen(s, begin+1)+1;
		}
	}
}
