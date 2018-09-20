package com.pat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * 使用hashset去重和排序
 */
public class SortTest {
	
	//可以使用TreeSet去重并排序
	public void treeSet()
	{
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
              
            int num = sc.nextInt();
            TreeSet<Integer> set = new TreeSet<Integer>();
            for(int i = 0 ; i < num ;i++){
                int curr = sc.nextInt();
                set.add(curr);
            }
            for(Integer i : set){
                System.out.println(i);
            }
        }
	}
	public static void main(String[] args)
    {
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNext())
		 {
			 Set<Integer> set = new HashSet<>();
			 List<Integer> list = new ArrayList<>();
			 int num = sc.nextInt();
			 for(int i=0; i<num; i++)
			 {
				 int input = sc.nextInt();
				 if(set.add(input))
				 {
					 list.add(input);
				 }
			 }
			 Collections.sort(list);
			 for(int i:list)
			 {
				 System.out.println(i);
			 }
		 }
    }
}
