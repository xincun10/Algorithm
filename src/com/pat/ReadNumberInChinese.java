package com.pat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadNumberInChinese {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1<<16);
		int num = Integer.parseInt(reader.readLine());
		
		String result = "";
		if(num < 0)
		{
			result = "Fu ";
			num = -num;
		}
		
		int high[] = split(num / 100000000);
		int middle[] = split(num % 100000000 / 10000);
		int low[] = split(num % 10000);
		String readhigh = readFour(high);
		String readmid = readFour(middle);
		String readlow = readFour(low);
		
		if(readhigh.length() != 0)
		{
			readhigh = readhigh.substring(readhigh.indexOf("ling")+5);//不读前面的一个ling+" "
			readhigh += " Yi ";
			if(readmid.length()==0 && readlow.length()!=0 && readlow.indexOf("ling")!=0)
			{
				readhigh += " ling ";
			}
		}
		if(readmid.length() != 0)
		{
			readmid += " Wan ";
		}
		if(readhigh.length()==0 && readmid.length()==0)
		{
			if(readlow.length()==0)
				readlow = "ling";
			else if(readlow.indexOf("ling")==0)
				readlow =readlow.substring(readhigh.indexOf("ling")+5);
		}
		result = result + readhigh + readmid + readlow;
		System.out.println(result);
	}

	//将四位数分割为数组
	private static int[] split(int num) {
		int[] arr = new int[4];
		arr[0] = num / 1000;
		arr[1] = num % 1000 / 100;
		arr[2] = num % 100 / 10;
		arr[3] = num % 10;
		return arr;
	}

	public static String[] digitstr={"Qian","Bai","Shi"};
    public static String[] numstr={"ling","yi","er","san","si","wu","liu","qi","ba","jiu","shi"};
	//读四位数
	public static String readFour(int[] digits)
	{
		String str = "";
		ArrayList<String> arr = new ArrayList<>();
		//默认没有非零数
		boolean flag = false;
		for(int i=3; i>=0; i--)
		{
			if(digits[i]==0 && flag==true && (!arr.contains("ling")))
			{
				arr.add(0, "ling");
			}
			if(digits[i]!=0)
			{
				if(i!=3)
					arr.add(0, numstr[digits[i]]+" "+digitstr[i]);
				else
					arr.add(0, numstr[digits[i]]);
				flag = true;
			}
		}
		for(int j=0; j<arr.size(); j++)
		{
			str += arr.get(j);
			if(j!=arr.size()-1)
			{
				str += " ";
			}
		}
		return str;
	}
}
