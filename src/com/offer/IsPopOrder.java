package com.offer;

import java.util.Stack;

/**
 * 
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * ��ע�⣺���������еĳ�������ȵģ�
 */
public class IsPopOrder {
	public static void main(String[] args) {
		
	}
	public boolean isPopOrder(int [] pushA, int [] popA) {
		if(pushA.length==0)
		{
			return false;
		}
		//����ջ
		Stack<Integer> stack = new Stack<>();
		//����ջλ�ñ�ʶ
		int popIndex = 0;
		for(int i=0; i<pushA.length; i++)
		{
			stack.push(pushA[i]);
			//�ж�ջ��Ԫ���Ƿ�popA����Ԫ��
			while(!stack.isEmpty() && stack.peek() == popA[popIndex])
			{
				stack.pop();
				popIndex++;
			}
		}
		return stack.empty();
	}
}
