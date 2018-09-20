package com.aqiyi;

import java.util.Arrays;
import java.util.Scanner;

public class Eat {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int P = in.nextInt();
		int[] nums = new int[N];
		for(int i=0; i<N; i++)
		{
			nums[i] = in.nextInt();
		}
		in.nextLine();
		for(int i=0; i<M; i++)
		{
			char[] tmp = in.nextLine().toCharArray();
			char fuhao = tmp[0];
			switch(fuhao) {
			case 'A':
				nums[(tmp[2]-'1')]++;
				break;
			case 'B':
				nums[(tmp[2]-'1')]--;
				break;
			default:
				break;
			}
		}
		int num = nums[P-1];
		Arrays.sort(nums);
		System.out.println(N-Arrays.binarySearch(nums, num));
	}

}
