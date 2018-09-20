package com.offer;
/*
 * ¾ØÐÎ¸²¸Ç
 */
public class RectCover {
	public int RectCover(int target) {
		if(target == 1 || target == 2 || target == 0)
			return target;
		else
		{
			return RectCover(target-1)+RectCover(target-2);
		}
    }
}
