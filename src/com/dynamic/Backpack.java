package com.dynamic;
/**
 * 有编号分别为a,b,c,d,e的五件物品，它们的重量分别是2,2,6,5,4，
 * 它们的价值分别是6,3,5,4,6，现在给你个承重为10的背包，如何让背包里装入的物品具有最大的价值总和？
 * @author Administrator
 *
 */
public class Backpack {

	/**
	 * 0-1背包问题
	 * 问题的关键是对于每一个物品，都只有放进去和不放进去两种选择
	 * @param weight 物品的重量
	 * @param value 物品的价值
	 * @param num 物品总数
	 * @param capacity 背包容量
	 * @return 最大价值
	 */
	public static int ZeroOneBackpack(int[] weight, int[] value, int num, int capacity)
	{
		//mp[i][j]表示可选物品为前i个，容量为j时的最大价值
		int[][] mp = new int[num+1][capacity+1];
		//可选物品为0和容量为0时，最大价值都为0
		for(int i=0; i<capacity+1; i++)
		{
			mp[0][i] = 0;
		}
		for(int i=0; i<num+1; i++)
		{
			mp[i][0] = 0;
		}
		
		for(int i=1; i<num+1; i++)
		{
			for(int j=1; j<capacity+1; j++)
			{
				if(weight[i-1] > j)//物品i的重量大于容量
				{
					//物品i放不进去，最大价值是前i-1个物品的最大价值
					mp[i][j] = mp[i-1][j];
				}
				else
				{
					//i可以放进去
					//比较把i放进去和不放进去的最大价值
					mp[i][j] = Math.max(value[i-1]+mp[i-1][j-weight[i-1]], mp[i-1][j]);
				}
			}
		}
		return mp[num][capacity];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weight = {2, 2, 6, 5, 4};
		int[] value = {6, 3, 5, 4, 6};
		int max_value = ZeroOneBackpack(weight, value, weight.length, 10);
		System.out.println(max_value);
	}

}
