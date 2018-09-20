package com.huawei;

import java.util.Scanner;

/*
 * 求最大公约数
 */
public class Gongyueshu {

	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = gongyueshu(a, b);
        System.out.println(a*b/c);
    }
    
    public static int gongyueshu(int a, int b)
    {
        if(a < b)
        {
            int tmp = a;
            a = b;
            b = tmp;
        }
        
        while(b!=0)
        {
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
}
