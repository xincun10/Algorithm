package com.safe;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int count = 0;
		for(int i=1;i<=N;i++){
            String str = String.valueOf(i);
            if((str.contains("2")||str.contains("5")||str.contains("6")||str.contains("9"))&&(!str.contains("3")&&!str.contains("4")&&!str.contains("7")))
               count++;
        }
        System.out.println(count);
	}
}
