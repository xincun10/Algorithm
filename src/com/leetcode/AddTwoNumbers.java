package com.leetcode;

import org.junit.Test;
/*
You are given two linked lists representing two non-negative numbers. 
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.
342+465=807
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
	@Test
	public void addTest()
	{
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		int res = addTwoNumbers(l1, l2).val;
		System.out.println(res);
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode node1 = l1;
		ListNode node2 = l2;
		int tmp = 0;
		//新加一个头结点，不表示数据
		ListNode head = new ListNode(0);
		ListNode res = head;
        while(node1!=null && node2!=null)
        {
    		int h = node1.val + node2.val + tmp;
    		
    		res.next = new ListNode(h%10);
    		
        	tmp = h/10;
        	node1 = node1.next;
        	node2 = node2.next;
        	res = res.next;
        }
        while(node1!=null)
        {
        	int h = node1.val + tmp;
        	res.next = new ListNode(h%10);
        	tmp = h/10;
        	node1 = node1.next;
        	res = res.next;
        }
        while(node2!=null)
        {
        	int h = node2.val + tmp;
        	res.next = new ListNode(h%10);
        	tmp = h/10;
        	node2 = node2.next;
        	res = res.next;
        }
        if(tmp!=0)
        {
        	res.next = new ListNode(tmp);
        }
        return head.next;
    }
}
