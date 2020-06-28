package com.yhh.swordoffer.question5;

import com.yhh.swordoffer.common.ListNode;

import java.util.Stack;

/**
 * @author: yuhaohan
 * @date: 星期四
 * <p>
 * 从尾到头打印链表中的数据，用栈的方式实现
 */
public class Question5 {

	public static void printLinkListNode(ListNode root) {
		Stack<ListNode> list = new Stack<>();
		while (root != null) {
			list.push(root);
			root = root.next;
		}
		while (!list.isEmpty()) {
			ListNode node = list.pop();
			System.out.print(node.value + " ");
		}
	}

	public static void main(String[] args) {
		ListNode root = new ListNode();
		root.value = 1;
		root.next = new ListNode();
		root.next.value = 2;
		root.next.next = new ListNode();
		root.next.next.value = 3;
		root.next.next.next = new ListNode();
		root.next.next.next.value = 4;
		root.next.next.next.next = new ListNode();
		root.next.next.next.next.value = 5;

		printLinkListNode(root);

	}
}
