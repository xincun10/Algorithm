package com.leetcode;
/*
 * Sort a linked list in O(n log n) time using constant space complexity.
1. 快慢指针；2. 归并排序。
  此题经典，需要消化吸收。
  复杂度分析:
             T(n)            拆分 n/2, 归并 n/2 ，一共是n/2 + n/2 = n
            /    \           以下依此类推：
          T(n/2) T(n/2)      一共是 n/2*2 = n
         /    \  /     \
        T(n/4) ...........   一共是 n/4*4 = n
 
       一共有logn层，故复杂度是 O(nlogn)
 */
public class SortList {

	public ListNode sortList(ListNode head) {
        /*
         * 归并排序
         * 1.找到中间指针
         * 2.排序
         * 3.合并排序结果
         */
		if(head==null || head.next==null)
		{
			return head;
		}
		ListNode mid = getMid(head);
		//将链表拆分为两个段
		ListNode midNext = mid.next;
		mid.next = null;
		
		return mergeSore(sortList(head), sortList(midNext));
    }
	
	//使用快慢指针获取中间指针
	public ListNode getMid(ListNode head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		ListNode slow = head;
		ListNode quick = head;
		while(quick.next!=null && quick.next.next!=null)
		{
			slow = slow.next;
			quick = quick.next.next;
		}
		return slow;
	}
	//按照顺序合并两个链表
	public ListNode mergeSore(ListNode n1, ListNode n2)
	{
		//添加一个辅助变量作为头结点
		ListNode head = new ListNode(0);
		ListNode cur1 = n1, cur2 = n2;
		ListNode cur = head;
		while(cur1!=null && cur2!=null)
		{
			//比较两个结点大小
			if(cur1.val<cur2.val)
			{
				cur.next = cur1;
				cur1 = cur1.next;
			}
			else
			{
				//第二个链表的值较小，节点后移一个
				cur.next = cur2;
				cur2 = cur2.next;
			}
			cur = cur.next;
		}
		if(cur1 == null)
		{
			cur.next = cur2;
		}
		else
		{
			cur.next = cur1;
		}
		return head.next;
	}
}
