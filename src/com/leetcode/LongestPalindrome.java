package com.leetcode;

import org.junit.Test;

/*
Given a string S, find the longest palindromic substring in S. 
You may assume that the maximum length of S is 1000, 
and there exists one unique longest palindromic substring.
最长回文子串。
 */
public class LongestPalindrome {

	@Test
	public void testPa()
	{
		String str = "aaabaaaa";
		System.out.println(longstPalindrome2(str));
	}
	/**
	 * 以字符串中的每一个字符为中心，判断是否是回文
	 * 记录最长的回文字符串长度和位置
	 * @param s
	 * @return
	 */
	public String longstPalindrome(String s)
	{
		if(s.length()==0 || s.length()==1)
		{
			return s;
		}
		int maxLen = 0;
		int start = 0;
		//回文字符串为奇数
		for(int i=1; i<s.length(); i++)
		{
			//j和k代表回文串的对称字符
			int j = i-1, k = i+1;
			int len = 1;
			while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k))
			{
				len += 2;
				if(len > maxLen)
				{
					maxLen = len;
					start = j;
				}
				j--;
				k++;
			}
		}
		//回文字符串为偶数
		for(int i=0; i<s.length(); i++)
		{
			//j和k代表回文串的对称字符
			int j = i, k = i+1;
			int len = 0;
			while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k))
			{
				len += 2;
				if(len > maxLen)
				{
					maxLen = len;
					start = j;
				}
				j--;
				k++;
			}
		}
		return s.substring(start, start+maxLen);
	}

	/**
	 * 马拉车算法，时间复杂度为线性
	 * 最优解
	 * 最长子串长度=半径-1
	 * 最长子串起始位置=（中间字符位置-半径）/2
	 * 最长子串结束位置=（中间字符位置-半径）/2+最长子串长度
	 */
	public String longstPalindrome2(String s)
	{
		//初始化字符串
		String res = "$#";
		for(int i=0; i<s.length(); i++)
		{
			res += s.charAt(i);
			res += "#";
		}
		
		//初始化辅助变量
		int mx = 0;//回文字符串最右侧
		int id = 0;//回文字符串中间位置
		int resLen = 0;//最长回文字符串半径
		int resCen = 0;//最长回文字符串中心位置
		int[] p = new int[res.length()];//每个字符对应的半径
		
		for(int i=1; i<res.length(); i++)
		{
			//i表示遍历的回文字符串中心
			if(mx > i)
			{
				//mx在i右侧
				p[i] = Math.min(p[id-(i-id)], mx-i);
			}
			else
			{
				p[i] = 1;
			}
			//以i为中心，查看i两侧字符是否是回文
			while(((i - p[i])>=0) && ((i + p[i])<res.length()) && (res.charAt(i+p[i]) == res.charAt(i-p[i])))
				p[i]++;
			//调整mx和id
			if(i+p[i] > mx)
			{
				mx = i+p[i];
				id = i;
			}
			//调整结果
			if(p[i] > resLen)
			{
				resLen = p[i];
				resCen = i;
			}
		}
		return s.substring((resCen-resLen)/2, (resCen-resLen)/2+resLen-1);
	}
	
	/**
	 * 递归实现
	 * 返回最大长度
	 * 注意首尾相同时，还要判断首尾中间的字符串是否为回文
	 * 超时什么鬼？
	 * @param s
	 * @return
	 */
	public String longstPalindrome(String s, int start, int end)
	{
		if(start > end)
		{
			return "";
		}
		if(start == end)
		{
			return s.substring(start, end+1);
		}
		if(s.charAt(start) == s.charAt(end))
		{
			//首尾相同，还要判断子串是不是回文字符串
			String str = longstPalindrome(s, start+1, end-1);
			if(str.length() < end-start-1)
			{
				String s1 = longstPalindrome(s, start+1, end);
				String s2 = longstPalindrome(s, start, end-1);
//				return Math.max(longstPalindrome(s, start+1, end), longstPalindrome(s, start, end-1));
				return (s1.length()>s2.length())?s1:s2;
			}
			return s.substring(start, end+1);
		}
		else
		{
			//首尾不同，返回两个序列的最大值
			String s1 = longstPalindrome(s, start+1, end);
			String s2 = longstPalindrome(s, start, end-1);
//			return Math.max(longstPalindrome(s, start+1, end), longstPalindrome(s, start, end-1));
			return (s1.length()>s2.length())?s1:s2;
		}
	}
}
