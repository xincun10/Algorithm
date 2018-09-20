package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 * Given n points on a 2D plane, 
 * find the maximum number of points that lie on the same straight line.
 */
public class MaxPoints {

	public int maxPoints(Point[] points) {
		int max = 0;
        /*
         * 遍历两遍点的集合，
         * 将过同一个点A的所有点以斜率为键，个数为值放到HashMap里面
         */
		for(int i=0; i<points.length; i++)
		{
			//过点points[i]的所有点的集合
			Map<Double, Integer> map = new HashMap<>();
			int imax = 1;//经过该点的线组成点的个数最大值
			int dup = 0;//重合点的个数
			int vcnt = 0;//与该点组成垂直线点的个数
			for(int j=0; j<points.length; j++)
			{
				if(i==j)
					continue;
				//要考虑分母为0的情况
				double dx = points[i].x-points[j].x;
				double dy = points[i].y-points[j].y;
				if(dx==0 && dy==0)
				{
					//与该点重合的点个数
					dup++;
				}
				else if(dx == 0)
				{
					if(vcnt==0)
						vcnt++;
					//垂直线上的点
					vcnt++;
				}
				else
				{
					//计算斜率
					double d = dy/dx;
					if(map.containsKey(d))
					{
						map.put(d, map.get(d)+1);
					}
					else
					{
						map.put(d, 2);
					}
					if(map.get(d)>imax)
					{
						imax = map.get(d);
					}
				}
			}
			//返回经过i点的所有点的最大值
			imax = Math.max(imax, vcnt) + dup;
			if(max<imax)
			{
				max = imax;
			}
		}
		return max;
    }
}
