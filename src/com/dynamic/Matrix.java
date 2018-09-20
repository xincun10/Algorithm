package com.dynamic;
/**
 * 给定n个矩阵｛A1,A2,…,An｝，其中Ai与Ai+1是可乘的，i=1,2 ,…,n-1。
 * 如何确定计算矩阵连乘积的计算次序，使得依此次序计算矩阵连乘积需要的数乘次数最少。
 * @author Administrator
 *
 */
public class Matrix {
	/**
	 * @param arr 矩阵数组
	 * @param num 矩阵的个数，数组长度-1
	 * @return 最小数乘次数
	 */
	public static int matrix_chain(int[] arr, int num)
	{
		//存储最小数乘次数
		int[][] times = new int[num][num];
		//存储最小数乘次数的断开点
		int[][] points = new int[num][num];
		
		int i,j,r,k;
	    
	    for (i = 0; i < num; i++)   //单一矩阵的最小乘次都置为0
	    {
	        times[i][i] = 0;
	    }
	    
	    for (r = 2; r <= num; r++)  //r为连乘矩阵的个数
	    {
	        for (i = 0; i <= num-r; i++)   //i表示连乘矩阵中的第一个
	        {
	            j = i + r -1;         //j表示连乘矩阵中的最后一个
	            times[i][j] = 99999;
	            for (k = i; k <= j-1; k++)  //在第一个与最后一个之间寻找最合适的断开点，注意，这是从i开始，即要先计算两个单独矩阵相乘的乘次
	            {
	                int tmp = times[i][k] + times[k+1][j] + arr[i]*arr[k+1]*arr[j+1];
	                if (tmp < times[i][j])
	                {
	                	times[i][j] = tmp;
	                    points[i][j] = k;
	                }
	            }
	        }
	    }
	    return times[0][num-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {30, 35, 15, 5, 10, 20, 25};
		int times = matrix_chain(array, array.length-1);
		System.out.println(times);
	}

}
