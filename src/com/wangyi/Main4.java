package com.wangyi;

import java.util.Scanner;

/*
 * 小Q得到一个神奇的数列: 1, 12, 123,...12345678910,1234567891011...。
 * 并且小Q对于能否被3整除这个性质很感兴趣。
 * 小Q现在希望你能帮他计算一下从数列的第l个到第r个(包含端点)有多少个数可以被3整除。
 * 太大了，存不到数组里面
 * 能被3整除的如下false, true, true, false, true, true, false, ...，可以发现这个序列以3为周期
 */
public class Main4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int left = scan.nextInt();
			int right = scan.nextInt();
			int count = 0;
			for(int i=left; i<=right; i++)
			{
				if(i%3 != 1)
					count++;
			}
			System.out.println(count);
		}
	}
//	//求1到n的和能否被3整除
//	public static boolean isOk(int input)
//	{
//		StringBuffer sb = new StringBuffer();
//		for(int i=1; i<=input; i++)
//		{
//			sb.append(i);
//		}
//		int n = Integer.parseInt(sb.toString());
//		int sum = 0;
//		if(n%2 == 0)
//		{
//			sum = (1 + n) * n/2;
//		}
//		else
//		{
//			sum = (1 + n) * (n-1)/2 + (n/2+1);
//		}
//		if(sum%3 == 0)
//			return true;
//		return false;
//	}
}
