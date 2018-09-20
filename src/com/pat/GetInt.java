package com.pat;

import java.util.Scanner;

public class GetInt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float num = scan.nextFloat();
		System.out.println(Math.round(num));
	}
}
