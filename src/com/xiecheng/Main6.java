package com.xiecheng;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			String result = null;
			String str = scan.nextLine();
			for(int i=0; i<str.length(); i++)
			{
				String tmp = str.substring(0, i+1);
				if(str.length()%(i+1)!=0)
				{
					continue;
				}
				else
				{
					String tmp2 = str.substring(i+1);
					for(int j=0; j<str.length()%(i+1); j++)
					{
						if(tmp2.indexOf(tmp)!=0)
						{
							break;
						}
						else
						{
							tmp2 = tmp2.substring(i+1);
						}
					}
					if(tmp2.length()==0)
					{
						result = tmp;
					}
				}
			}
			System.out.println(result);
		}
	}

}
