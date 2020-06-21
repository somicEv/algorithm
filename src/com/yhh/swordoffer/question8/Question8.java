package com.yhh.swordoffer.question8;

import java.util.Arrays;

/**
 * @author: win
 * @date: 星期日
 */
public class Question8 {

	public static int getMinNumber(int[] numbers) {
		// 判空操作
		if (numbers == null || numbers.length <= 0) {
			return -1;
		}
		int startIndex = 0;
		int endIndex = numbers.length - 1;
		int midIndex = startIndex;
		while (numbers[startIndex] >= numbers[endIndex]) {
			if (endIndex - startIndex == 1) {
				midIndex = endIndex;
				break;
			}
			midIndex = (startIndex + endIndex) / 2;
			if (numbers[startIndex] == numbers[endIndex] && numbers[startIndex] == numbers[midIndex]) {
				Arrays.sort(numbers);
				return numbers[0];
			}
			if (numbers[midIndex] >= numbers[startIndex]) {
				startIndex = midIndex;
			} else if (numbers[midIndex] <=numbers[endIndex]) {
				endIndex = midIndex;
			}
		}
		return numbers[midIndex];
	}

	public static void main(String[] args) {
		int[] numbers = {2, 2, 2, 0, 1};
		//int[] numbers = {3, 4, 5, 1, 2};
		int minNumber = getMinNumber(numbers);
		System.out.println(minNumber);
	}

}
