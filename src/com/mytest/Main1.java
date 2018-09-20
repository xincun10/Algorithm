package com.mytest;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		while(in.hasNext())
		{
			String str = in.nextLine();
			while(str.indexOf("{")!=-1) {
				String tmp = str.substring(str.indexOf("{")+1, str.indexOf("}"));
				list.add(tmp);
				str = str.substring(str.indexOf("}")+1);
			}
		}
		list.forEach(item -> System.out.println(item));
	}
}
