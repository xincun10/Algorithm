package com.zcy;
/**
 * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
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
		//�ж������Ƿ�Ϊ�գ�������[[]]
		if(array.length==0 || array[0].length==0)
		{
			return false;
		}
		/*
		 * �������򣬴����Ͻǿ������target�����ϽǴ������ƶ���
		 * ��������Ͻ�С�������ƶ���
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
