package com.offer;
/*
 * 数值的整数次方
 */
public class Power {
	public double Power(double base, int exponent) {
        return Math.pow(base, exponent);
	}
}
//非库函数实现
class Solution {
    public double Power(double base, int exponent) {
       if(base==0.0&&exponent<0)
           return 0.0;
        int abs=Math.abs(exponent);
        double result=pow(base,abs);
        if(exponent<0)
            return 1/result;
        return result;
    }
    public double pow(double base,int abs){
        if(abs==0)
            return 1.0;
        if(base==1.0)
            return base;
        double re=pow(base,abs>>1);
        re*=re;
        if((abs&1)==1)
            return re*base;
        return re;
    }
}
