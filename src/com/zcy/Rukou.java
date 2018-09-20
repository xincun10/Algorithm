package com.zcy;
/*
 * һ�������а����������ҳ�������Ļ�����ڽ�㡣
 */
public class Rukou {

	//����ָ�룬���߱߶Ͽ����ӣ����һ���õ��ľ������
	public ListNode EntryNodeOfLoop1(ListNode pHead)
	{
		if(pHead.next == null)
		{
			return null;
		}
		ListNode front = pHead;
		ListNode fallow = pHead;
		while(front.next != null)
		{
			front = front.next;
			fallow.next = null;
			fallow = front;
		}
	    return front;
	}
	
	public ListNode EntryNodeOfLoop(ListNode pHead)
	{
		ListNode fast = pHead;
		ListNode slow = pHead;
		while(fast!=null && fast.next!=null)
		{
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow)
			{
				break;
			}
		}
		if(fast==null || fast.next==null)
			return null;
		fast = pHead;
		while(fast!=slow)
		{
			fast = fast.next;
			slow = slow.next;
		}
		return fast;
	}
}
