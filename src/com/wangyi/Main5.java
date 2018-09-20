package com.wangyi;

import java.util.Scanner;

/*
 * 
安置路灯
小Q正在给一条长度为n的道路设计路灯安置方案。

为了让问题更简单,小Q把道路视为n个方格,需要照亮的地方用'.'表示, 不需要照亮的障碍物格子用'X'表示。

小Q现在要在道路上设置一些路灯, 对于安置在pos位置的路灯, 这盏路灯可以照亮pos - 1, pos, pos + 1这三个位置。

小Q希望能安置尽量少的路灯照亮所有'.'区域, 希望你能帮他计算一下最少需要多少盏路灯。
 */
public class Main5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			for(int i=0; i<n; i++)
			{
				int len = scan.nextInt();
				String str = scan.next();
				int count = 0;
				//只要将路灯放置在遇到.之后的下一个位置即可
				for(int j=0; j<len; )
				{
					if(str.charAt(j)=='.')
					{
						count++;
						j += 3;
					}
					else
					{
						j++;
					}
				}
				System.out.println(count);
			}
		}
	}
}
