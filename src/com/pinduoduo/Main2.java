package com.pinduoduo;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int stars = in.nextInt();
		 int people = in.nextInt();
		 char[][] arr = new char[people][stars];
		 for(int i=0; i<people; i++)
		 {
			 arr[i] = in.next().toCharArray();
		 }
		 int[][] win = new int[stars][stars];
		 for(int k=0; k<people; k++)
		 {
			 for(int i=0; i<stars; i++)
			 {
				 for(int j=i+1; j<stars; j++)
				 {
					 if(arr[k][i]<arr[k][j])
					 {
						 win[i][j]++;
					 }
					 else if(arr[k][i]>arr[k][j])
					 {
						 win[i][j]--;
					 }
				 }
			 }
		 }
		 boolean flag = true;
		 for(int i=0; i<stars; i++)
		 {
			 for(int j=i+1; j<stars; j++)
			 {
				 if(win[i][j]<=people/2)
				 {
					 flag = false;
					 break;
				 }
			 }
			 if(flag)
			 {
				 System.out.println(i);
				 break;
			 }			 
		 }
		 System.out.println(-1);
	}

}
