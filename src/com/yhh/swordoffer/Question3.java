package com.yhh.swordoffer;

/**
 * @author: yuhaohan
 * @date: 星期一
 */
public class Question3 {

	public static void findInPartaillySortedMatrix(int[][] arrays, int maxRow, int maxColumn, int number) {
		// 设置查询起始条件
		int row = 0;
		int column = maxColumn - 1;

		if (arrays[row][column] == number) {
			System.out.println("已找到输入的数字，位置为：row--{" + row + "},column--{" + column + "}");
			return;
		}

		while ((row >= 0 && row < maxRow) && (column >= 0 && column < maxColumn)) {
			if (arrays[row][column] == number) {
				System.out.println("已找到输入的数字，位置为：row--{" + row + "},column--{" + column + "}");
				break;
			} else if (number > arrays[row][column]) {
				row++;
			} else {
				column--;
			}
		}
	}

	public static void main(String[] args) {
		int[][] arrays = {
				{1, 2, 8, 9},
				{2, 4, 9, 12},
				{4, 7, 10, 13},
				{6, 8, 11, 15}
		};
		findInPartaillySortedMatrix(arrays,4,4,12);
	}

}
