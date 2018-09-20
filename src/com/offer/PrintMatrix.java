package com.offer;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
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
	 * ����ģ��ħ����ʱ����ת�ķ�����һֱ��ȡ����һ�еĲ���
	 * ���� 
	 * 1 2 3
	 * 4 5 6
	 * 7 8 9
	 * �����ɾ����һ�к��ٽ���һ����ʱ����ת���ͱ�ɣ�
	 * 6 9
	 * 5 8
	 * 4 7
	 * �����ظ������������ɡ�
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
				//����һ�м����б�
				al.add(matrix[0][i]);
			}
			if(matrix.length==1)
			{
				//����ֻʣ��һ�У�ֱ���˳�
				break;
			}
			matrix = this.roleMatrix(matrix);
		}
		return al;
	}
	//��ת���󣬲��Ƴ���һ��
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
