package com.yhh.swordoffer;

/**
 * @author: yuhaohan
 * @date: 星期二
 */
public class Question4 {

	public static int replaceBlank(char[] string, int length) {
		if (string == null || length <= 0) {
			return -1;
		}
		int totalBlank = 0;
		// 统计字符数组中空格的数量
		for (char str : string) {
			if (' ' == str) {
				totalBlank++;
			}
		}
		// 计算替换空格后字符数组总长度
		int newCharArrayLength = length + totalBlank * 2;
		// 如果替换后的长度超过给出的字符数组长度则处理失败
		if (newCharArrayLength > string.length) {
			return -1;
		}
		// 将长度转换为数组下标
		// 旧字符数组的最后一个字符的存放位置
		int oldCharLengthIndex = length - 1;
		// 新字符数组的最后一个字符的存放位置
		int newCharLengthIndex = newCharArrayLength - 1;
		// 字符数组中存在空白字符，一直处理到所有空白字符没有为止
		while (oldCharLengthIndex >= 0 && oldCharLengthIndex < newCharLengthIndex) {
			// 如果有就替换为'%20'，没有就移动数组
			if (string[oldCharLengthIndex] == ' ') {
				string[newCharLengthIndex--] = '0';
				string[newCharLengthIndex--] = '2';
				string[newCharLengthIndex--] = '%';
			} else {
				string[newCharLengthIndex--] = string[oldCharLengthIndex];
			}
			oldCharLengthIndex--;
		}
		return newCharArrayLength;
	}

	public static void main(String[] args) {
		char[] string = new char[50];
		string[0] = ' ';
		string[1] = 'e';
		string[2] = ' ';
		string[3] = ' ';
		string[4] = 'r';
		string[5] = 'e';
		string[6] = ' ';
		string[7] = ' ';
		string[8] = 'a';
		string[9] = ' ';
		string[10] = 'p';
		string[11] = ' ';
		int length = replaceBlank(string, 12);
		System.out.println(new String(string, 0, length));
	}
}
