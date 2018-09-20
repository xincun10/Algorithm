package com.tencent;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int K = scan.nextInt();
			int A = scan.nextInt();
			int X = scan.nextInt();
			int B = scan.nextInt();
			int Y = scan.nextInt();
			Map<Integer, Integer> map = new HashMap<>();
			for(int x=0; x<101; x++)
			{
				if(((K-x*A)>=0) && ((K-x*A)%B==0))
				{
					int y = (K-x*A)/B;
					map.put(x, y);
				}
			}
			BigInteger count = new BigInteger("0");
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) { 
				BigInteger tmp = C(X, entry.getKey());
				BigInteger tmp2 = C(Y, entry.getValue());
				count = count.add(tmp.multiply(tmp2));
			}
			System.out.println(count.divideAndRemainder(new BigInteger("1000000007"))[1]);
			
		}
	}
	
	//计算可能的总数
	public static BigInteger C(int a,int b){  
        BigInteger temp=new BigInteger("0");  
        BigInteger sum=new BigInteger("1");  
        for(int i=0;i<b;i++){  
            String tem=a+"";  
            BigInteger temp1=new BigInteger(tem);  
            BigInteger t2=temp1.subtract(temp);  
            BigInteger t1=sum.multiply(t2);  
            sum = t1.divide(temp.add(new BigInteger("1")));  
            temp=temp.add(new BigInteger("1"));  
        }  
        return sum;  
    }
}
