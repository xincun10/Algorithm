package com.test.baidu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 * ��ά�ռ�����N���㣬ÿ���������������ɫ������֮һ��������ɫ�ֱ��Ǻ��������ֱ���'R', 'G', 'B'��ʾ�� 
����Ҫ�ҳ������㣬�����һ�������Σ�ʹ����������ε�������
���������α������㣺���������ɫҪôȫ����ͬ��Ҫôȫ����ͬ�� 
 * @author Administrator
 *
 */
public class Main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int n = scan.nextInt();
			List<Point> points = new ArrayList<>();
			int index = 0;
			while(index++<n)
			{
				String str = scan.next();
				points.add(new Point(str.charAt(0), scan.nextInt(), scan.nextInt(), scan.nextInt()));
			}
			List<Trigle> list = new ArrayList<>();
			compute(points, list);
			Collections.sort(list);
			System.out.printf("%.5f",list.get(0).area);
		}
	}
	
	//���ݵ��������п�����ɵ�������
	public static void compute(List<Point> points, List<Trigle> list)
	{
		int length = points.size();
		if(length>=3)
		{
			for(int i=0; i<length-2; i++)
			{
				for(int j=i+1; j<length-1; j++)
				{
					for(int k=j+1; k<length; k++)
					{
						if((points.get(i).color==points.get(j).color && points.get(i).color==points.get(k).color)
								|| (points.get(i).color!=points.get(j).color && points.get(i).color!=points.get(k).color
										&& points.get(j).color!=points.get(k).color))
						list.add(new Trigle(points.get(i), points.get(j), points.get(k)));
					}
				}
			}
		}
	}
}

class Point
{
	char color;
	int x,y,z;
	public Point(char color, int x, int y, int z)
	{
		this.color = color;
		this.x = x;
		this.y = y;
		this.z = z;
	}
}

class Trigle implements Comparable<Trigle>
{
	Point p1, p2, p3;
	
	double area;
	
	public Trigle(Point p1, Point p2, Point p3)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		double a = Math.sqrt(Math.abs((p1.x - p2.x)* (p1.x - p2.x)+(p1.y - p2.y)* (p1.y - p2.y)+(p1.z - p2.z)* (p1.z - p2.z)));
		double b = Math.sqrt(Math.abs((p1.x - p3.x)* (p1.x - p3.x)+(p1.y - p3.y)* (p1.y - p3.y)+(p1.z - p3.z)* (p1.z - p3.z)));
		double c = Math.sqrt(Math.abs((p3.x - p2.x)* (p3.x - p2.x)+(p3.y - p2.y)* (p3.y - p2.y)+(p3.z - p2.z)* (p3.z - p2.z)));
		double p = (a+b+c)/2;
		this.area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}

	@Override
	public int compareTo(Trigle o) {
		if(this.area>o.area)
			return -1;
		else if(this.area<o.area)
			return 1;
		else
			return 0;
	}
}
