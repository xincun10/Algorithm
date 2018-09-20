package com.xiecheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 水仙花数
 */
public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int low = scan.nextInt();
			int high = scan.nextInt();
			List<Integer> list = new ArrayList<>();
			for(int i=low; i<=high; i++)
			{
				if(isOk(i))
				{
					list.add(i);
				}
			}
			if(list.size()==0)
			{
				System.out.println("no");
			}
			else
			{
				list.forEach((item)->{System.out.print(item+" ");});
			}
		}
	}
	
	public static boolean isOk(int number)
	{
		int high = number/100;
		int mid = number%100/10;
		int low = number%10;
		if(Math.pow(high, 3)+Math.pow(mid, 3)+Math.pow(low, 3)==number)
		{
			return true;
		}
		return false;
	}
}
