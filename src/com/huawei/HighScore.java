package com.huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HighScore {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nums = in.nextInt();
		int ops = in.nextInt();
		int[] score = new int[nums];
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<nums; i++)
		{
			score[i] = in.nextInt();
		}
		in.nextLine();
		for(int i=0; i<ops; i++)
		{
			String str = in.nextLine();
			if(str.charAt(0)=='Q')
			{
				int result = query(score, str.substring(str.indexOf(" ")+1, str.lastIndexOf(" ")), str.substring(str.lastIndexOf(" ")+1));
				list.add(result);
			}
			else if(str.charAt(0)=='U')
			{
				update(score, str.substring(str.indexOf(" ")+1, str.lastIndexOf(" ")), str.substring(str.lastIndexOf(" ")+1));
			}
			else
			{
				continue;
			}
		}
		list.forEach(item -> System.out.println(item));
	}

	private static void update(int[] score, String pos, String newScore) {
		// 更新成绩
		score[Integer.parseInt(pos)-1] = Integer.parseInt(newScore);		
	}

	private static int query(int[] score, String start, String end) {
		// 查询从start到end的最高成绩
		int s = Integer.parseInt(start);
		int e = Integer.parseInt(end);
		if(e>score.length)
		{
			e = score.length;
		}
		if(s > e)
		{
			int tmp = s;
			s = e;
			e= tmp;
		}
		int[] tmp = Arrays.copyOfRange(score, s-1, e);
		Arrays.sort(tmp);
		return (tmp[tmp.length-1]);
	}
	
	
}
