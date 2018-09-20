package com.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JifuJunzheng {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> zlist = new ArrayList<>();
		List<Integer> flist = new ArrayList<>();
		int sum = 0;
		double avg = 0.0;
		while(in.hasNext())
		{
			int t = in.nextInt();
			if(t >= 0)
			{
				zlist.add(t);
				sum += t;
			}
			else
			{
				flist.add(t);
			}
		}
		System.out.println(flist.size());
		if(zlist.size()>0) avg = (double)sum/zlist.size();
		System.out.printf("%.1f", avg);
	}
	//第一的方法
	public static void main2()
	{
		Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            float sum=0;
            int count=0;
            int countx=0;
            String str=sc.nextLine();
            String[] strx=str.split(" ");
            for(int i=0;i<strx.length;i++){
                if(Integer.parseInt(strx[i])>=0){
                    sum+=Double.parseDouble(strx[i]);
                    countx++;
                }else{
                    count++;
                }
            }
            System.out.println(count);
            System.out.println((double)Math.round(((sum/countx))*10)/10);
        }
	}
}
