package com.huawei;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CharCollection {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
		while(in.hasNext())
        {
            String str = in.nextLine();
            if(!str.equals(""))
            {
                char[] items = str.toCharArray();
                Set<Character> set = new LinkedHashSet<>();
                for(int i=0; i<items.length; i++)
                {
                    set.add(items[i]);
                }
                for(char c:set)
                {
                    System.out.print(c);
                }
                System.out.println();
            }
            			
        }
        
	}
}
