package com.wangyi;

import java.util.Scanner;

public class MagicCoin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		System.out.println(getCoin(count));
	}

	private static String getCoin(int count) {
		//完全二叉树
		String result = "";
		while(count > 0)
		{
			if(count%2 == 0)//偶数，最后一次一定投给2号机器
			{
				result = "2" + result;
			}
			else
			{
				result = "1" + result;
			}
			count = (count - 1 ) / 2;
		}
		return result;
	}
}
