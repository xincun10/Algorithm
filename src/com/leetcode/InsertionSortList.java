package com.leetcode;
/*
 * Sort a linked list using insertion sort.
 */
public class InsertionSortList {

	//遍历链表，普通的插入排序，但是要保留新链表的前向结点
	public ListNode insertionSortList(ListNode head) {
        ListNode cur = head;//保存原链表中遍历到的节点位置
        ListNode newhead = new ListNode(Integer.MIN_VALUE);//用最小值初始化辅助节点
        ListNode pre = newhead;//当前位置的前一个位置
        while(cur!=null)
        {
        	//保存原链表的下一个位置
        	ListNode next = cur.next;
        	//从头遍历新链表
        	pre = newhead;
        	while(pre.next!=null && pre.next.val<cur.val)
        	{
        		pre = pre.next;
        	}
        	//无论那种情况，cur节点都是插到pre之后
        	cur.next = pre.next;
        	pre.next = cur;
        	/*
        	if(pre.next.val>=cur.val)
        	{
        		//插到pre后面
        		cur.next = pre.next;
        		pre.next = cur;
        	}
        	else
        	{
        		//pre.next==null仍然插到pre后面
        		//当前节点插入新链表尾部
        		cur.next = pre.next;
        		pre.next = cur;
        	}
        	*/
        	//处理下一节点
        	cur = next;
        }
        return newhead.next;
    }
}
