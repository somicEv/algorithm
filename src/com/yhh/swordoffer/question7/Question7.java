package com.yhh.swordoffer.question7;

import java.util.Stack;

/**
 * @author: win
 * @date: 星期六
 */
public class Question7 {

	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();

	public Question7() {
	}

	public void appendTail(int number) {
		stack1.push(number);
	}

	public int deleteHead() {
		if (stack2.size() <= 0) {
			while (stack1.size() > 0) {
				Integer pop = stack1.pop();
				stack2.push(pop);
			}
			return stack2.pop();
		} else {
			return stack2.pop();
		}
	}

	public static void main(String[] args) {
		Question7 question7 = new Question7();
		question7.appendTail(1);
		question7.appendTail(2);
		question7.appendTail(3);
		question7.appendTail(4);
		question7.appendTail(5);
		question7.appendTail(6);

		int i = question7.deleteHead();
		System.out.println(i);

	}

}
