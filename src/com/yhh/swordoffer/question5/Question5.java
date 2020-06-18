package com.yhh.swordoffer.question5;

import com.yhh.swordoffer.common.LinkListNode;

import java.util.Stack;

/**
 * @author: yuhaohan
 * @date: 星期四
 * <p>
 * 从尾到头打印链表中的数据，用栈的方式实现
 */
public class Question5 {

	public static void printLinkListNode(LinkListNode root) {
		Stack<LinkListNode> list = new Stack<>();
		while (root != null) {
			list.push(root);
			root = root.next;
		}
		while (!list.isEmpty()) {
			LinkListNode node = list.pop();
			System.out.print(node.value + " ");
		}
	}

	public static void main(String[] args) {
		LinkListNode root = new LinkListNode();
		root.value = 1;
		root.next = new LinkListNode();
		root.next.value = 2;
		root.next.next = new LinkListNode();
		root.next.next.value = 3;
		root.next.next.next = new LinkListNode();
		root.next.next.next.value = 4;
		root.next.next.next.next = new LinkListNode();
		root.next.next.next.next.value = 5;

		printLinkListNode(root);

	}
}
