package com.dynamic;
/**
 * 数塔第i层有i个结点，要求从顶层走到底层，若每一步只能走到相邻的结点，
 * 则经过的结点的数字之和最大是多少？
 * @author Administrator
 *
 */
public class SumTower {

	/**
	 * 计算最大值
	 * @param data 存储每层数据
	 * @param m 层数
	 * @param n 每层数据数
	 * @return
	 */
	public static int MaxSumTower(int[][] data, int m, int n)
	{
		//dp[i][j]存储从底部到达i层j个结点的最大值
		//dp[0][0]存储的值即为最大值
		//dp[m-1][i] = data[m-1][i]
		int[][] dp = new int[m][n];
		for(int i=0; i<n; i++)
		{
			dp[m-1][i] = data[m-1][i];
		}
		for(int i=m-2; i>=0; i--)
		{
			for(int j=0; j<=i; j++)
			{
				dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j+1]) + data[i][j];
			}
		}
		return dp[0][0];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = {
				{9, 0, 0, 0, 0},
				{12, 15, 0, 0, 0},
				{10, 6, 8, 0, 0},
				{2, 18, 9, 5, 0},
				{19, 7, 10, 4, 16}
		};
		int result = MaxSumTower(data, data.length, data[0].length);
		System.out.println(result);
	}

}
