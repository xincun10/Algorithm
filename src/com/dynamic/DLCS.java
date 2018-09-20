package com.dynamic;

public class DLCS {

	/*
	 * �������������
	 * ֻҪ˳��һ����������������
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
	 * ��������Ӵ�
	 * ����������������в�ͬ���ǣ��Ӵ�Ҫ��������
	 * ����������ֻҪ˳��֤����ȷ�ľ����ˣ�����ʹ��һ����������¼
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
	 * �����������
	 * ��������������һ�����У�X[1...m]��������������г��ֵ�����������еĳ��ȡ�
	 */
	public static int IncreasingSubstringLen(char[] str, int m)
	{
		int[] depth = new int[m];
		int max = 0;
		for(int i=0; i<m; i++)
		{
			/*
			 * depth[i]�洢��i������������г���
			 * if(depth[i]>depth[j])
			 * ����������г���Ϊdepth[j]+1
			 * ����ֻ������Ϊ1
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
	//������������к�
	public static int SumSubstring(int[] arr, int num)
	{
		//dp[i]��ʾ�� arr[i]��Ϊĩβ���������е�����
		int[] dp = new int[num];
		dp[0] = arr[0];
		int max = dp[0];
		for(int i=1; i<num; i++)
		{
			//Ҫô����arr[i]Ҫôֻ��arr[i]
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
