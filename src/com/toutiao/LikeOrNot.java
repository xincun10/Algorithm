package com.toutiao;

import java.util.Scanner;

/*
 * �û�ϲ��
 * ���룺 ��1��Ϊn�����û��ĸ��� ��2��Ϊn��������
 * ��i�������û����Ϊi���û���ĳ�����µ�ϲ�ö� 
 * ��3��Ϊһ��������q�����ѯ������  
 * ��4�е��ڣ�3+q���У�ÿ�а���3������l,r,k����һ���ѯ��
 * �����Ϊl<=i<=r���û��ж���������ϲ��ֵΪk���û��ĸ����� ���ݷ�Χn <= 300000,q<=300000 k������
 * �����һ��q�У�ÿ��һ����������ϲ��ֵΪk���û��ĸ���
 * ����
 * 5
 * 1 2 3 3 5
 * 3
 * 1 2 1
 * 2 4 5
 * 3 5 3
 * ���
 * 1
 * 0
 * 2
 * ��������:
��5���û���ϲ��ֵΪ�ֱ�Ϊ1��2��3��3��5��
��һ��ѯ�ʶ��ڱ��[1,2]���û�ϲ��ֵΪ1���û��ĸ�����1
�ڶ���ѯ�ʶ��ڱ��[2,4]���û�ϲ��ֵΪ5���û��ĸ�����0
������ѯ�ʶ��ڱ��[3,5]���û�ϲ��ֵΪ3���û��ĸ�����2
 */
public class LikeOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int num1 = scan.nextInt();
			int[] arr = new int[num1+1];
			for(int i=1; i<=num1; i++)
			{
				arr[i] = scan.nextInt();
			}
			int num2 = scan.nextInt();
			int[] res = new int[num2+1];
			for(int i=1; i<=num2; i++)
			{
				res[i] = numInArray(scan.nextInt(), scan.nextInt(), scan.nextInt(), arr);
			}
			for(int i=1; i<=num2; i++)
			{
				System.out.println(res[i]);
			}
		}
	}

	public static int numInArray(int low, int high, int number, int[] arr)
	{
		int count = 0;
		for(int i=low; i<=high; i++)
		{
			if(arr[i] == number)
				count++;
		}
		return count;
	}
}
