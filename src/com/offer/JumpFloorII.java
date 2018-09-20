package com.offer;
/*
 * ±äÌ¬ÌøÌ¨½×
 */
public class JumpFloorII {

	public int JumpFloorII(int target) {
        int[] result = new int[target+1];
        result[0] = 0;
        result[1] = 1;
        for(int i=2; i<=target; i++)
        {
        	result[i] = 2*result[i-1];
        }
        return result[target];
    }
}
