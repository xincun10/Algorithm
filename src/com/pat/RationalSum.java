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
		
		//处理负值
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
		
		if(flag)//正数
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
	
	//得到分子
	private static long getNumerator(String string) {
		return Long.parseLong(string.substring(0, string.indexOf("/")));
	}

	//得到分母
	private static long getDenominator(String string) {
		return Long.parseLong(string.substring(string.indexOf("/")+1));
	}

	//求两个数的最大公约数
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
	
	//求两个数的最小公倍数
	public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
	
}
