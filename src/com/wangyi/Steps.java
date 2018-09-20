package com.wangyi;

import java.util.Scanner;

public class Steps {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dis = in.nextInt();
		int step5 = dis/5;
		int step4 = (dis - step5*5)/4;
		int step3 = (dis - step5*5 - step4*4)/3;
		int step2 = (dis - step5*5 - step4*4 - step3*3)/2;
		int step1 = dis - step5*5 - step4*4 - step3*3 - step2*2;
		System.out.println(step1+step2+step3+step4+step5);
	}
}
