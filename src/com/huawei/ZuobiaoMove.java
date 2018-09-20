package com.huawei;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * �����ƶ�
 * ������ʽ�ж������Ƿ�Ϸ�
 */
public class ZuobiaoMove {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String str = in.nextLine();
			
			int x = 0, y = 0;
			String[] strs = str.split(";");
			for(int i=0; i<strs.length; i++)
			{
				if(isLegal(strs[i]))
				{
					int dis = Integer.parseInt(strs[i].substring(1));
					switch(strs[i].charAt(0))
					{
					case 'A':
						x -= dis;
						break;
					case 'D':
						x += dis;
						break;
					case 'W':
						y += dis;
						break;
					case 'S':
						y -= dis;
						break;
					default:
						break;
					}
				}
			}
			System.out.println(x+","+y);
		}
	}
	//�ж������Ƿ�Ϸ�
	private static boolean isLegal(String str)
	{
		if(str.length()>3)
			return false;
		//������ʽ����
		String regEx = "^[AWSD]\\d{1,2}$";
		//����������ʽ
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(str);
		//�����ַ������Ƿ���ƥ��������ʽ���ַ�/�ַ���
		boolean rs = matcher.find();
		return rs;
	}
}
//num1�ķ����������ж��Ƿ�Ϸ��������쳣��ֱ�ӽ�����һ��ѭ��
class Main
{
	public static void handle()
	{
		Scanner scan=new Scanner(System.in);
        while(scan.hasNextLine()){
            int x=0;
            int y=0;
            String[]tokens=scan.nextLine().split(";");
            for(int i=0;i<tokens.length;i++){
                try{
                    int b=Integer.parseInt(tokens[i].substring(1,tokens[i].length()));
                    if(tokens[i].charAt(0)=='A'){
                        x-=b;
                    }
                     if(tokens[i].charAt(0)=='W'){
                        y+=b;
                    }
                     if(tokens[i].charAt(0)=='S'){
                        y-=b;
                    }
                     if(tokens[i].charAt(0)=='D'){
                        x+=b;
                    }
                     
                     
                }catch(Exception e){
                    continue;
                }
            }
            System.out.println(x+","+y);
             
        }
	}
}
