package com.zcy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharCount {
	public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1<<16);
        String str = reader.readLine().toUpperCase();
        char a = reader.readLine().toUpperCase().charAt(0);
        int count = 0;
//        char a = str.charAt(str.length()-1);
        char arr[] = str.toCharArray();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==a)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
