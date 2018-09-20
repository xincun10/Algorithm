package com.offer;
/*
 * ÌøÌ¨½×
 */
public class JumpFloor {

	public int JumpFloor(int target) {
        if(target == 0) return 0;
        if(target == 1) return 1;
        if(target == 2) return 2;
        int result = 0;
        int before = 1;
        int now = 2;
        for(int i=3; i<=target; i++)
        {
            result = before + now;
            before = now;
            now = result;
        }
        return result;
    }
}
