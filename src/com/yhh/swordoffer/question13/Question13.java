package com.yhh.swordoffer.question13;

import com.yhh.swordoffer.common.ListNode;

/**
 * @author: yuhaohan
 * @date: 星期日
 */
public class Question13 {

	public static ListNode deleteNode(ListNode head, ListNode node) {
		if (head == null || node == null) {
			return head;
		}
		// 判断要删除的节点是否为头结点
		if (head.value == node.value) {
			return head.next;
		}
		// 如果删除的节点为尾节点
		if (node.next == null) {
			ListNode tmp = head;
			while (tmp.next != null && tmp.next.value != node.value) {
				tmp = tmp.next;
			}
			tmp.next = null;
		} else {
			// 说明是链表中间的节点
			node.value = node.next.value;
			node.next = node.next.next;
		}
		return head;
	}

	public static ListNode deleteNode(ListNode head, int val) {
		if (head.value == val) {
			return head.next;
		}
		ListNode pre = head, cur = head.next;
		while (cur != null && cur.value != val) {
			pre = cur;
			cur = cur.next;
		}
		if (cur != null) {
			pre.next = cur.next;
		}
		return head;
	}

	public static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.value + "->");
			head = head.next;
		}
		System.out.println("null");
	}


	public static void main(String[] args) {
		ListNode head = new ListNode();
		head.value = 1;

		head.next = new ListNode();
		head.next.value = 2;

		head.next.next = new ListNode();
		head.next.next.value = 3;

		head.next.next.next = new ListNode();
		head.next.next.next.value = 4;

		ListNode middle = head.next.next.next.next = new ListNode();
		head.next.next.next.next.value = 5;

		head.next.next.next.next.next = new ListNode();
		head.next.next.next.next.next.value = 6;

		head.next.next.next.next.next.next = new ListNode();
		head.next.next.next.next.next.next.value = 7;

		head.next.next.next.next.next.next.next = new ListNode();
		head.next.next.next.next.next.next.next.value = 8;

		ListNode last = head.next.next.next.next.next.next.next.next = new ListNode();
		head.next.next.next.next.next.next.next.next.value = 9;

		head = deleteNode(head, null); // 删除的结点为空
		printList(head);
		ListNode node = new ListNode();
		node.value = 12;

		head = deleteNode(head, head); // 删除头结点
		printList(head);
		head = deleteNode(head, last); // 删除尾结点
		printList(head);
		head = deleteNode(head, middle); // 删除中间结点
		printList(head);

		head = deleteNode(head, node); // 删除的结点不在链表中
		printList(head);

	}


}
