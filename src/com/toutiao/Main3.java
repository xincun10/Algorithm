package com.toutiao;

import java.util.Scanner;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main3 {

	public static void main(String[] args) throws ScriptException {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			String[] ress = new String[n];
			scan.nextLine();

			for (int i = 0; i < n; i++) {
				String str = scan.nextLine();
				Integer value = (Integer) new ScriptEngineManager().getEngineByName("js").eval(str);
				ress[i] = String.valueOf(value);
			}
			for (int i = 0; i < n; i++) {
				char[] tmp = ress[i].toCharArray();
				for (int j = 0; j < tmp.length; j++) {
					int[][] arr = printx(tmp[j]-'0');
					
					for(int k=0; k<5; k++)
					{
						if(arr[j][k]==0)
							System.out.print('.');
						else
							System.out.print('6');
					}
					System.out.print("..");
				}
				System.out.println();
			}
		}
	}

	public static int[][] printx(int x) {
		if (x == 0) {
			int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 },
					{ 1, 1, 1, 1, 1 } };
			return arr;
		}
		if (x == 1) {
			int[][] arr = { { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 },
					{ 0, 0, 0, 0, 1 } };
			return arr;
		}
		if (x == 2) {
			int[][] arr = { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0 },
					{ 1, 1, 1, 1, 1 } };
			return arr;
		}
		if (x == 3) {
			int[][] arr = { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 },
					{ 1, 1, 1, 1, 1 } };
			return arr;
		}
		if (x == 4) {
			int[][] arr = { { 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 },
					{ 0, 0, 0, 0, 1 } };
			return arr;
		}
		if (x == 5) {
			int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 },
					{ 1, 1, 1, 1, 1 } };
			return arr;
		}
		if (x == 6) {
			int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 },
					{ 1, 1, 1, 1, 1 } };
			return arr;
		}
		if (x == 7) {
			int[][] arr = { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 },
					{ 0, 0, 0, 0, 1 } };
			return arr;
		}
		if (x == 8) {
			int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 },
					{ 1, 1, 1, 1, 1 } };
			return arr;
		}
		if (x == 9) {
			int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 },
					{ 1, 1, 1, 1, 1 } };
			return arr;
		}
		return null;
	}

	public static int[][] print1() {
		int[][] arr = { { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 } };
		return arr;
	}

	public static int[][] print2() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };
		return arr;
	}

	public static int[][] print3() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
		return arr;
	}

	public static int[][] print4() {
		int[][] arr = { { 1, 0, 0, 0, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 } };
		return arr;
	}

	public static int[][] print5() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
		return arr;
	}

	public static int[][] print6() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
		return arr;
	}

	public static int[][] print7() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1 } };
		return arr;
	}

	public static int[][] print8() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
		return arr;
	}

	public static int[][] print9() {
		int[][] arr = { { 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1 } };
		return arr;
	}
}
