package com.offer;

import java.util.Stack;
/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ�
 * �õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1����
 *
 * ��һ��ջdata�������ݣ�������һ��ջmin����������ջ��С����.
 * ÿ����ջ��ʱ�������ջ��Ԫ�ر�min�е�ջ��Ԫ��С���������ջ��������ջ��
 */
public class MainSatck {
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> min_stack = new Stack<>();
	//�洢min_stackջ��Ԫ��
	Integer tmp = null;
	
	public void push(int node) {
		if(tmp==null)
		{
			tmp = node;
			//ջ��Ԫ��Ϊ�գ�minҲ������ջ����
			stack.push(node);
			min_stack.push(node);
		}
		else
		{
			//�ж�min_stackջ��Ԫ�أ����С��node����������ջ����
			if(tmp>=node)
			{
				tmp = node;
				min_stack.push(node);
			}
			stack.push(node);
		}
	}
    
    public void pop() {
        //�жϳ�ջ���ǲ�����Сֵ
    	//�ȳ�ջ����ջ��ͬ������tmpֵ
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
