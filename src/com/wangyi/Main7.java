package com.wangyi;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		int[] interes = new int[times];
		int[] clears = new int[times];
		int minus = in.nextInt();
		for(int i=0; i<times; i++)
		{
			interes[i] = in.nextInt();
		}
		for(int i=0; i<times; i++)
		{
			clears[i] = in.nextInt();
		}
		int max = 0, index = 0;
		for(int i=0; i<times; i++)
		{
			int tmp = 0;
			if(clears[i]==0)
			{
				for(int j=i, count=0; j<times && count<minus; j++,count++)
				{
					if(clears[j]==0)
						tmp += interes[j];
				}
				if(tmp > max)
				{
					max = tmp;
					index = i;
				}
			}
		}
		int sum = 0;
		for(int i=0; i<minus; i++)
		{
			if(index+i>times-1)
				break;
			clears[index+i] = 1;
		}
		for(int i=0; i<times; i++)
		{
			if(clears[i] == 1)
			{
				sum += interes[i];
			}
		}
		System.out.println(sum);
	}

}
