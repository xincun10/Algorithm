package com.pat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RationalSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1<<16);
		int N = Integer.parseInt(reader.readLine());
		String[] strs = reader.readLine().split(" ");
		long lcm = 1;
		for(int i=0; i<N; i++)
		{
			lcm = lcm(lcm, getDenominator(strs[i]));
		}
		
		long sum = 0;
		for(int i=0; i<N; i++)
		{
			sum += getNumerator(strs[i]) * (lcm/getDenominator(strs[i]));
		}
		
		//����ֵ
		boolean flag = true;
		if(sum < 0)
		{
			sum = -sum;
			flag = false;
		}
		
		long rst = sum / lcm;
		sum = sum - rst * lcm;
		long b = gcd(sum, lcm);
		sum /= b;
		lcm /= b;
		
		if(flag)//����
		{
			if(sum == 0)
			{
				System.out.println(rst);
			}
			else if(rst == 0)
			{
				System.out.println(sum + "/" + lcm);
			}
			else
			{
				System.out.println(rst + " " + sum + "/" + lcm);
			}
		}
		else
		{
			if(sum == 0)
			{
				System.out.println("-" + rst);
			}
			else if(rst == 0)
			{
				System.out.println("-" + sum + "/" + lcm);
			}
			else
			{
				System.out.println("-" + rst + " " + sum + "/" + lcm);
			}
		}
		
	}
	
	//�õ�����
	private static long getNumerator(String string) {
		return Long.parseLong(string.substring(0, string.indexOf("/")));
	}

	//�õ���ĸ
	private static long getDenominator(String string) {
		return Long.parseLong(string.substring(string.indexOf("/")+1));
	}

	//�������������Լ��
	public static long gcd(long x, long y)
	{
		if(Math.abs(x) < Math.abs(y))
		{
			long tmp = x;
			x = y;
			y = tmp;
		}
		if(y == 0)
		{
			return x;
		}
		else
		{
			return gcd(y, x%y);
		}
	}
	
	//������������С������
	public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
	
}
