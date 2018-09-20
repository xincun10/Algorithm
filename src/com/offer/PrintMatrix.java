package com.offer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 */
public class PrintMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		int matrix[][] = new int[rows][cols];
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				matrix[i][j] = scan.nextInt();
			}
		}
		System.out.println("input end");
		PrintMatrix pm = new PrintMatrix();
		ArrayList<Integer> al = pm.printMatrix(matrix);
		System.out.println(al);
	}
	/**
	 * 可以模拟魔方逆时针旋转的方法，一直做取出第一行的操作
	 * 例如 
	 * 1 2 3
	 * 4 5 6
	 * 7 8 9
	 * 输出并删除第一行后，再进行一次逆时针旋转，就变成：
	 * 6 9
	 * 5 8
	 * 4 7
	 * 继续重复上述操作即可。
	 * @param matrix
	 * @return
	 */
	public ArrayList<Integer> printMatrix(int[][] matrix)
	{
		ArrayList<Integer> al = new ArrayList<>();
		while(matrix.length>0 && matrix[0].length>0)
		{
			for(int i=0; i<matrix[0].length; i++)
			{
				//将第一行加入列表
				al.add(matrix[0][i]);
			}
			if(matrix.length==1)
			{
				//矩阵只剩下一行，直接退出
				break;
			}
			matrix = this.roleMatrix(matrix);
		}
		return al;
	}
	//旋转矩阵，并移除第一行
	public int[][] roleMatrix(int[][] matrix)
	{
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] new_matrix = new int[cols][rows-1];
		for(int i=0; i<cols; i++)
		{
			for(int j=1; j<rows; j++)
			{
				new_matrix[i][j-1] = matrix[j][cols-1-i];
			}
		}
		return new_matrix;
	}
}
