package com.wangyi;

import java.util.Scanner;

public class MagicCoin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		System.out.println(getCoin(count));
	}

	private static String getCoin(int count) {
		//��ȫ������
		String result = "";
		while(count > 0)
		{
			if(count%2 == 0)//ż�������һ��һ��Ͷ��2�Ż���
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
