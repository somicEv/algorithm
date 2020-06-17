package com.yhh.swordoffer.question4;

/**
 * @author: yuhaohan
 * @date: 星期三
 * <p>
 * 合并两个有序数组
 */
public class Question4_1 {

	public static void mergeArrays(int[] array1, int[] array2) {
		if (array1 == null || array2 == null) {
			return;
		}
		// 先确定两个数组比较的起点下标
		// 数组2的起始下标为数组长度减1，数据1的起始下标为有数据的最后一位的下标
		int array2StartIndex = array2.length - 1;
		int array1StartIndex = array1.length - array2.length - 1;
		for (int i = array1.length - 1; i >= 0; i--) {
			// 特殊情况1：当数组1都被移动过后，将数组2的剩余元素复制到数组1当前指定的位置
			if (array1StartIndex + 1 == 0) {
				array1[i] = array2[array2StartIndex];
				array2StartIndex--;
			} else if (array2StartIndex + 1 == 0) {
				// 特殊情况1：当数组2的元素都移动完成了，则合并结束
				break;
			} else if (array1[array1StartIndex] > array2[array2StartIndex]) {
				array1[i] = array1[array1StartIndex];
				array1StartIndex--;
			} else {
				array1[i] = array2[array2StartIndex];
				array2StartIndex--;
			}
		}
		for (int num : array1) {
			System.out.print(num);
		}
	}

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 6, 7, 0, 0, 0};
		int[] array2 = {5, 8, 9};
		mergeArrays(array1, array2);

	}


}
