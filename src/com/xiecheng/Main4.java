package com.xiecheng;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			String str = scan.nextLine();
			str = str.replaceAll("^[　*| *| *|//s*]*", "").replaceAll("[　*| *| *|//s*]*$", "");
			String[] nums = str.split("\\s+");
			int len = nums.length;
			int[][] source = new int[len][len];
			int[][] des = new int[len][len];
			for(int i=0; i<len; i++)
			{
				if(i==0)
				{
					for(int j=0; j<len; j++)
					{
						source[i][j] = Integer.parseInt(nums[j]);
					}
				}
				else
				{
					for(int j=0; j<len; j++)
					{
						source[i][j] = scan.nextInt();
					}
				}
			}
			for(int i=0; i<len; i++)
			{
				for(int j=0; j<len; j++)
				{
					des[j][len-i-1] = source[i][j];
				}
			}
			for(int i=0; i<len; i++)
			{
				for(int j=0; j<len; j++)
				{
					if(j!=len-1)
						System.out.print(des[i][j]+"  ");
					else
						System.out.print(des[i][j]);
				}
				if(i!=len-1)
				{
					System.out.println();
					System.out.println();
				}
			}
		}
	}
}
