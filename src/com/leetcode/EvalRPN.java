package com.leetcode;

import java.util.Stack;

/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation.
Valid operators are+,-,*,/. Each operand may be an integer or another expression.
Some examples:

  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class EvalRPN {

	public int evalRPN(String[] tokens) {
        /*
         * 将数字存放到栈，每遇到一个运算符弹出两个数作为运算数
         */
		Stack<Integer> stack = new Stack<>();
		String fuhao = "+-*/";
		for(String str:tokens)
		{
			int result = 0;
			if(fuhao.indexOf(str)<0)
			{
				stack.push(Integer.parseInt(str));
			}
			else
			{
				int a2 = stack.pop();
				int a1 = stack.pop();
				switch(str){
				case "+":
					result = (a1+a2);
					break;
				case "-":
					result = (a1-a2);
					break;
				case "*":
					result = (a1*a2);
					break;
				case "/":
					result = (a1/a2);
					break;
				}
				stack.push(result);
			}
		}
		return stack.pop();
    }
}
