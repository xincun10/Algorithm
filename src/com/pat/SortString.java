package com.pat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//������ֵ������е��ַ���
public class SortString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();//��겻�ỻ��
		in.nextLine();//���ջ��з�
		List<String> list = new ArrayList<>();
		for(int i=0; i<num; i++)
		{
			list.add(in.nextLine());
		}
		Collections.sort(list);
		list.forEach(item -> System.out.println(item));
	}
}
