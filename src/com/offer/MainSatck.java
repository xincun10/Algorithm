package com.offer;

import java.util.Stack;
/**
 * 定义栈的数据结构，请在该类型中实现一个能够
 * 得到栈中所含最小元素的min函数（时间复杂度应为O（1））
 *
 * 用一个栈data保存数据，用另外一个栈min保存依次入栈最小的数.
 * 每次入栈的时候，如果入栈的元素比min中的栈顶元素小或等于则入栈，否则不如栈。
 */
public class MainSatck {
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> min_stack = new Stack<>();
	//存储min_stack栈顶元素
	Integer tmp = null;
	
	public void push(int node) {
		if(tmp==null)
		{
			tmp = node;
			//栈顶元素为空，min也进行入栈操作
			stack.push(node);
			min_stack.push(node);
		}
		else
		{
			//判断min_stack栈顶元素，如果小于node，不进行入栈操作
			if(tmp>=node)
			{
				tmp = node;
				min_stack.push(node);
			}
			stack.push(node);
		}
	}
    
    public void pop() {
        //判断出栈的是不是最小值
    	//先出栈后入栈，同步更新tmp值
    	int num1 = stack.pop();
    	int num2 = min_stack.pop();
    	if(num1!=num2)
    	{
    		min_stack.push(num2);
    	}
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return min_stack.peek();
    }
}
