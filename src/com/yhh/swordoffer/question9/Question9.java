package com.yhh.swordoffer.question9;

/**
 * @author: yuhaohan
 * @date: 星期一
 */
public class Question9 {

	// 斐波那契数列
	public static int fibonacci(int n) {
		int[] arrays = {0, 1};
		if (n < 2) {
			return arrays[n];
		}
		int number1 = 0;
		int number2 = 1;
		int numberN = 0;
		for (int i = 2; i <= n; i++) {
			// f(n) = f(n-1) + f(n-2)
			numberN = (number2 + number1) % 1000000007;
			number1 = number2;
			number2 = numberN;
		}
		return numberN;
	}

	// 青蛙跳台阶
	public static int numWays(int n) {
		if (n < 2) {
			return 1;
		}
		int number1 = 1;
		int number2 = 1;
		int numberN = 0;
		for (int i = 2; i <= n; i++) {
			// f(n) = f(n-1) + f(n-2)
			numberN = (number2 + number1) % 1000000007;
			number1 = number2;
			number2 = numberN;
		}
		return numberN;
	}

	public static void main(String[] args) {
		long fibonacci = fibonacci(7);
		System.out.println(fibonacci);
	}

}
