package com.yhh.swordoffer.question10;

/**
 * @author: yuhaohan
 * @date: 星期二
 */
public class Question10 {

	public static int numberOf1_1(int n) {
		int count = 0;
		int flag = 1;
		while (n != 0) {
			if ((n & flag) == 1) {
				count++;
			}
			n = n >> 1;
		}
		return count;
	}

	public static int numberOf1_2(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = (n - 1) & n;
		}
		return count;
	}

	public static void main(String[] args) {

		int i = numberOf1_1(9);
		System.out.println(i);
	}
}
