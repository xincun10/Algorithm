package com.huawei;

import java.util.Scanner;

public class Lifanggen {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        double result = getCubeRoot(num);
        System.out.printf("%.1f", result);
    }

	public static double getCubeRoot(double input) {
		double x0 = 1;
		double x1 = x0 - (x0 - input/(x0*x0)) / 3;
		while(Math.abs(x1-x0) > 0.000001)
		{
			x0 = x1;
			x1 = x0 - (x0 - input/(x0*x0)) / 3;
		}
		return x1;
	}
}
