package com.test.baidu;

import java.util.Scanner;
/**
 * һ�������Ϲ���N���㣬��һ����������Ƕȶ�������λ�ã���N-1�����Ƕȶ��ܵļҡ�
 * ��������Ҫ���εĴ�0�������ߵ�N-1�����ꡣ
 * ���ǳ���0�������N-1�����꣬�������������N-2��������ѡ��һ���㣬
 * ��ֱ�ӽ��������Ե����ʶȶ��ܻؼ������߶��پ��룿
 * @author Administrator
 *
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++)
			{
				arr[i] = scan.nextInt();
			}
			int index = 0;
			int dis = 0;
			int sum = 0;
			for(int i=1; i<n-1; i++)
			{
				int tmp = Math.abs(arr[i]-arr[i-1])+Math.abs(arr[i]-arr[i+1]);
				sum += Math.abs(arr[i]-arr[i-1]);
				tmp = tmp-Math.abs(arr[i+1]-arr[i-1]);
				if(tmp>dis)
				{
					dis = tmp;
					index = i;
				}
			}
			sum += Math.abs(arr[n-1]-arr[n-2]);
			System.out.println(sum-dis);
			
		}
	}
}
