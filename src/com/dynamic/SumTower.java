package com.dynamic;
/**
 * ������i����i����㣬Ҫ��Ӷ����ߵ��ײ㣬��ÿһ��ֻ���ߵ����ڵĽ�㣬
 * �򾭹��Ľ�������֮������Ƕ��٣�
 * @author Administrator
 *
 */
public class SumTower {

	/**
	 * �������ֵ
	 * @param data �洢ÿ������
	 * @param m ����
	 * @param n ÿ��������
	 * @return
	 */
	public static int MaxSumTower(int[][] data, int m, int n)
	{
		//dp[i][j]�洢�ӵײ�����i��j���������ֵ
		//dp[0][0]�洢��ֵ��Ϊ���ֵ
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
