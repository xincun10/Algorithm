package com.zcy;
/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 */
public class FindArray {
	public static void main(String[] args) {
		int[][] arr = new int[][] {{}};
		System.out.println(arr.length);
		System.out.println(FindArray.find(1,arr));
	}
	
	public static boolean find(int target, int [][] array)
	{
		//判断数组是否为空，或者是[[]]
		if(array.length==0 || array[0].length==0)
		{
			return false;
		}
		/*
		 * 矩阵有序，从右上角看，如果target比右上角大，向下移动，
		 * 如果比右上角小，向左移动。
		 */
		for(int i=0,j=array.length-1; i<array.length && j>=0;)
		{
			if(target>array[i][j])
			{
				i++;
			}
			else if(target<array[i][j])
			{
				j--;
			}
			else
			{
				return true;
			}
		}
		return false;
	}
}
