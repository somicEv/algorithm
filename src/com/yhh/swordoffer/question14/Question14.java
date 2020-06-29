package com.yhh.swordoffer.question14;

/**
 * @author: yuhaohan
 * @date: 星期一
 */
public class Question14 {

	public static void recordOddEven(int[] arrays) {
		if (arrays == null) {
			return;
		}
		// 定义起始下标和末尾下标
		int start = 0;
		int end = arrays.length - 1;
		while (start < end) {
			// 移动起始下标直到找到偶数为止
			if (start < end && (arrays[start] % 2) != 0) {
				start++;
			}
			// 移动末尾下标直到找到奇数为止
			if (start < end && (arrays[end] % 2) == 0) {
				end--;
			}
			if (start < end) {
				int temp = arrays[start];
				arrays[start] = arrays[end];
				arrays[end] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arrays = {1,2,3,4,5,6};
		recordOddEven(arrays);
		for (int num : arrays) {
			System.out.println(num);
		}
	}

}
