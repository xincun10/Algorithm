package com.dynamic;

public class DLCS {

	/*
	 * 求最长公共子序列
	 * 只要顺序一样，不必是连续的
	 */
	public static int SubsequenceLen(char[] str1, char[] str2, int m, int n)
	{
		int[][] depth = new int[m+1][n+1];
		for(int i=1; i<=m; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(str1[i-1] == str2[j-1])
				{
					depth[i][j] = depth[i-1][j-1] + 1;
				}
				else
				{
					depth[i][j] = Math.max(depth[i-1][j], depth[i][j-1]);
				}
			}
		}
		return depth[m][n];
	}
	/*
	 * 求最长公共子串
	 * 和上面最长公共子序列不同的是，子串要求连续，
	 * 不像子序列只要顺序保证是正确的就行了，所以使用一个变量来记录
	 */
	public static int SubstringLen(char[] str1, char[] str2, int m, int n)
	{
		int[][] depth = new int[m+1][n+1];
		int max = 0;
		for(int i=1; i<=m; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(str1[i-1] == str2[j-1])
				{
					depth[i][j] = depth[i-1][j-1] + 1;
				}
				else
				{
					depth[i][j] = 0;
				}
				if(depth[i][j] > max)
				{
					max = depth[i][j];
				}
			}
		}
		return max;
	}
	/*
	 * 最长递增子序列
	 * 问题描述：给定一个序列：X[1...m]，求在这个序列中出现的最长递增子序列的长度。
	 */
	public static int IncreasingSubstringLen(char[] str, int m)
	{
		int[] depth = new int[m];
		int max = 0;
		for(int i=0; i<m; i++)
		{
			/*
			 * depth[i]存储到i的最长递增子序列长度
			 * if(depth[i]>depth[j])
			 * 最长递增子序列长度为depth[j]+1
			 * 否则，只能重置为1
			 */
			depth[i] = 1;
			for(int j=0; j<i; j++)
			{
				if(str[i] > str[j])
				{
					depth[i] = depth[j] + 1;
				}
				else
				{
					depth[i] = 1;
				}
			}
			if(depth[i] > max)
			{
				max = depth[i];
			}
		}
		return max;
	}
	//最大连续子序列和
	public static int SumSubstring(int[] arr, int num)
	{
		//dp[i]表示以 arr[i]作为末尾的连续序列的最大和
		int[] dp = new int[num];
		dp[0] = arr[0];
		int max = dp[0];
		for(int i=1; i<num; i++)
		{
			//要么包含arr[i]要么只有arr[i]
			dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
			if(dp[i] > max)
			{
				max = dp[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String x = "abcdefg", y = "edfg";
//		int len = SubstringLen(x.toCharArray(), y.toCharArray(), x.length(), y.length());
//		String str = "abefcd";
//		int len = IncreasingSubstringLen(str.toCharArray(), str.length());
		int[] arr = {-2, 11, -4, 13, -5, -2};
		int max = SumSubstring(arr, arr.length);
		System.out.println(max);
	}

}
