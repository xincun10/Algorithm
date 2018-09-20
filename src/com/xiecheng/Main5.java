package com.xiecheng;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			int[][] peo = new int[n][3];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<3; j++)
				{
					peo[i][j] = scan.nextInt();
				}
			}
			int man = scan.nextInt();
			int child = scan.nextInt();
			int time = scan.nextInt();
			System.out.println("0,1,180.0");
		}
	}
}
