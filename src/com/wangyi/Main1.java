package com.wangyi;
/*
 * 矩形重叠
 * 平面内有n个矩形, 第i个矩形的左下角坐标为(x1[i], y1[i]), 右上角坐标为(x2[i], y2[i])。

如果两个或者多个矩形有公共区域则认为它们是相互重叠的(不考虑边界和角落)。

请你计算出平面内重叠矩形数量最多的地方,有多少个矩形相互重叠。
 */
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			int[] x1 = new int[n];
			int[] y1 = new int[n];
			int[] x2 = new int[n];
			int[] y2 = new int[n];
			for(int i=0; i<n; i++)
			{
				x1[i] = scan.nextInt();
			}
			for(int i=0; i<n; i++)
			{
				y1[i] = scan.nextInt();
			}
			for(int i=0; i<n; i++)
			{
				x2[i] = scan.nextInt();
			}
			for(int i=0; i<n; i++)
			{
				y2[i] = scan.nextInt();
			}
			
		}
	}

	public static boolean isRectIntersect(int xa1, int ya1, int xa2, int ya2, int xb1, int yb1, int xb2, int yb2) {
		if ((Math.max(xa1, xa2) >= Math.min(xb1, xb2)) && (Math.max(ya1, ya2) >= Math.min(yb1, yb2))) {
			return true;
		}
		return false;
	}
}
