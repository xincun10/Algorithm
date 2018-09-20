package com.huawei;

import java.util.Scanner;
/*
 * �����������
 */
public class Redraiment {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		//�洢�߶�
		int[] arr = new int[num];
		//�洢�����Ӧ�Ĳ���
		int[] step = new int[num];
		//�洢���ֵ
		int max = 1;
		for(int i=0; i<num; i++)
		{
			arr[i] = in.nextInt();
			step[i] = 1;
		}
		for(int i=1; i<num; i++)
		{
			for(int j=0; j<i; j++)
			{
				//j��������i������
				if(arr[i]>arr[j] && step[j]+1>step[i])
				{
					step[i] += 1;
					if(step[i]>max)
					{
						max = step[i];
					}
				}
			}
		}
		System.out.println(max);
	}
}
