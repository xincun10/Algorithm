package com.pinduoduo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String[] array = {"Alice", "Bob", "Cathy", "Dave"};
        if(num <= 4)
        {
        	System.out.println(array[num-1]);
        	return;
        }
        int i;
        for(i=1; i<num; i++)
        {
        	if(Math.pow(2, i)<=num && Math.pow(2, i+1)>num)
        	{
        		break;
        	}
        }
        i--;
        int tmp1 = (int) (Math.pow(2, i+1)-3);
        int tmp2 = (int) Math.pow(2, i-1);
        int res = (num - tmp1)/tmp2 + 1;
        System.out.println(array[res-1]);
    }
}