# 【面试题3】二维数组查找

### 1、题目

​	在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

### 2、思路

​	从整个二维数组的右上角作为起始点开始查找，由于给定二维数组是从上到下从左到右都是递增的，所以要查找的数如果比当前遍历到的数大则从下一行继续遍历，反之则从上一列继续遍历，直到找到，或者超出数组范围为止。

### 3、代码

```java
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

```



