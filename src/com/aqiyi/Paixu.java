package com.aqiyi;

import java.util.Arrays;
import java.util.Scanner;

/*
 * ����
 * ţţ��һ������Ϊn����������,ţţ���������н�������Ϊһ�����ϸ��������С�
 * ţţ�Ƚ�����,�����ƶ������ٵ������������,�����������һ����������Ҫ�ƶ����ٸ������е�Ԫ�ء�
 * (��һ��Ԫ�ز�����ԭ�����ڵ�λ��,���Ԫ�ؾ��Ǳ��ƶ��˵�) 
 * 
 * ����ʹ����������ַ����⣬����û��ͨ��ȫ��case��
 * Ԫ���ƶ��Ķ��壿��������
 */
public class Paixu {

	//��ȷ�ⷨ��������֮���ԭ��������Ƚϣ�ֻҪλ�ò�һ�����ʹ����ƶ���
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int num = scan.nextInt();
			int[] arr = new int[num];
			int[] flag = new int[num];
			for(int i=0; i<num; i++)
			{
				int tmp = scan.nextInt();
				arr[i] = tmp;
				flag[i] = tmp;
			}
			Arrays.sort(arr);
			int count = 0;
			for(int i=0; i<num; i++)
			{
				if(arr[i]!=flag[i])
					count++;
			}
			System.out.println(count);
		}
	}
	//����ַ���������
	public static void main1(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int num = scan.nextInt();
			int[] arr = new int[num];
			int[] flag = new int[num];
			for(int i=0; i<num; i++)
			{
				arr[i] = scan.nextInt();
				flag[i] = 1;
			}
			int max = 1;
			for(int i=1; i<num; i++)
			{
				for(int j=0; j<i; j++)
				{
					if(arr[j]<=arr[i] && flag[j]+1>flag[i])
					{
						flag[i] = flag[j] + 1;
						if(max<flag[i])
						{
							max = flag[i];
						}
					}
				}
			}
			System.out.println(num - max);
		}
	}
}
