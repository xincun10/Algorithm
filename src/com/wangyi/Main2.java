package com.wangyi;
/*
 * 数对
牛牛以前在老师那里得到了一个正整数数对(x, y), 牛牛忘记他们具体是多少了。

但是牛牛记得老师告诉过他x和y均不大于n, 并且x除以y的余数大于等于k。
牛牛希望你能帮他计算一共有多少个可能的数对。
暴力求解会超时。
 */
import java.util.Scanner;

public class Main2 {

	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			long n = scan.nextLong();
			long k = scan.nextLong();
			long count = 0;
			if(k==0)
			{
				count = n*n;
			}
			else
			{
				//x%y>=k，说明y>k,枚举y
				for(long y=k+1; y<=n; y++)
				{
					//n/y的余数总共有n/y+1组,前n/y组余数大于等于k的个数为y-k
					count += n/y*(y-k) + Math.max(0, n%y+1-k);
				}
			}
			System.out.println(count);
		}
	}
}
