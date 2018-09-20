package com.pinduoduo;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int num = in.nextInt();
		for(int i=0; i<num; i++)
		{
			sum += in.nextInt();
		}
		System.out.println(sum/300+1);
	}

}
