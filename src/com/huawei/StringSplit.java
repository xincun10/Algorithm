package com.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		while(input.hasNext())
        {
            int num = input.nextInt();
            input.nextLine();
            for(int i=0; i<num; i++)
            {
                String str = input.nextLine();
                list = split(str, list);
            }
        }
        list.forEach(item -> System.out.println(item));
	}
	
	public static List<String> split(String s, List<String> list) {
		while (s.length() >= 8) {
			list.add(s.substring(0, 8));
			s = s.substring(8);			
		}
		if (s.length() < 8 && s.length() > 0) {
			s = s + "00000000";
			list.add(s.substring(0, 8));
		}
		return list;
	}
}
