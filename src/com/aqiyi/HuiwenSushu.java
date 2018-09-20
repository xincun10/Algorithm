package com.aqiyi;

import java.util.Scanner;

/*
 * ��������
 * ���һ������ֻ�ܱ�1���Լ�����,�ͳ��������������
 * ���һ�������ŷ��Ŷ���һ��,�ͳ�Ϊ������ǻ�����������:6, 66, 606, 6666
 * ���һ�����ּ�������Ҳ�ǻ�����,�ͳ�������ǻ�������
 * ţţ���ڸ���һ������[L, R],ϣ���������������������ж��ٸ�����������
 */
public class HuiwenSushu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int low = scan.nextInt();
			int high = scan.nextInt();
			int number = 0;
			while(low<=high)
			{
				if(isPrime(low) && isHuiwen(low))
				{
					number++;
				}
				low++;
			}
			System.out.println(number);
		}
	}

	//�ж�һ�����ǲ�������
	public static boolean isPrime(int num)
	{
		if(num==1 || num==2)
			return false;
		for(int i=2; i<num/2; i++)
		{
			if(num%i == 0)
				return false;
		}
		return true;
	}
	//�ж�һ�����ǲ��ǻ�����
	public static boolean isHuiwen(int num)
	{
		String str = String.valueOf(num);
		for(int i=0; i<str.length()/2; i++)
		{
			if(str.charAt(i) != str.charAt(str.length()-i-1))
				return false;
		}
		return true;
	}
}
