package com.tencent;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			//机器数
			int n = scan.nextInt();
			Task[] machine = new Task[n];
			//任务数
			int m = scan.nextInt();
			Task[] tasks = new Task[m];
			for(int i=0; i<n; i++)
			{
				machine[i] = new Task(scan.nextInt(), scan.nextInt());
			}
			for(int i=0; i<n; i++)
			{
				tasks[i] = new Task(scan.nextInt(), scan.nextInt());
			}
			Arrays.sort(tasks);
            Arrays.sort(machine);
            int count = 0;
            for(int i=0; i<m; i++)
            {
            	if(machine[i].compareTo(tasks[i])>0)
                {
                	count++;
                	
                }
            }
		}
	}
}
class Task implements Comparable<Task>
{
	int time;
	int level;
	
	public Task(int time, int level) {
		super();
		this.time = time;
		this.level = level;
	}

	@Override
	public int compareTo(Task o) {
		return (this.time*200+this.level*3)-(o.time*200-o.level*3);
	}
		
}
