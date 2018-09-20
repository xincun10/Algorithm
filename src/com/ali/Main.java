package com.ali;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int posx, posy;
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();
		String str = str2+","+str1;
		double m1 = Mianji(str2);
		double m2 = Mianji(str);
		System.out.println(m1+":"+m2);
	}
	
	//计算多边形面积
	public static double Mianji(String str2)
	{
		String nums[] = str2.split(",");
		int len = nums.length;
	    int x,y,x0,y0,sum = 0;
    	x = Integer.parseInt(nums[0]);
    	y = Integer.parseInt(nums[1]);
    	x0 = x;
	    y0 = y;
	    int i = 1;
	    while(i<len-1)
	    {
	    	int xtmp, ytmp;
	    	xtmp = Integer.parseInt(nums[++i]);
	    	ytmp = Integer.parseInt(nums[++i]);
	    	sum += (x*ytmp-y*xtmp);
	        x = xtmp;
	        y = ytmp;
	    }
	    sum += (x*y0-y*x0);
	    return (double)(Math.abs(sum)/2.0);
	}
}
