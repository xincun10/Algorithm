package com.offer;
/*
 * �ϲ��������������
 * ���������������������������������ϳɺ������
 * ��Ȼ������Ҫ�ϳɺ���������㵥����������
 */
public class Merge {
	//�ݹ�汾
	public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null)
        	return list2;
        if(list2 == null)
        	return list1;
        if(list1.val <= list2.val)
        {
        	list1.next = Merge(list1.next, list2);
        	return list1;
        }
        else
        {
        	list2.next = Merge(list1, list2.next);
        	return list2;
        }
    }
	//�ǵݹ�汾
	public ListNode Merge2(ListNode list1,ListNode list2)
	{
		if(list1 == null)
        	return list2;
        if(list2 == null)
        	return list1;
		ListNode node = null;
		ListNode head = null;
		while(list1!=null && list2!=null)
		{
			if(list1.val < list2.val)
			{
				if(head == null)
					head = node = list1;
				else
				{
					node.next = list1;
					node = list1;
				}
				list1 = list1.next;
			}
			else
			{
				if(head == null)
					head = node = list2;
				else
				{
					node.next = list2;
					node = list2;
				}
				list2 = list2.next;
			}
		}
		if(list1 == null)
			node.next = list2;
		else
			node.next = list1;
		return head;
	}
}
