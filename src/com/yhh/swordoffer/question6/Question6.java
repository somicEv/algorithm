package com.yhh.swordoffer.question6;

import com.yhh.swordoffer.common.TreeNode;

/**
 * @author: yuhaohan
 * @date: 星期五
 */
public class Question6 {

	public static TreeNode construct(int[] preTreeList, int preStartIndex, int preEndIndex,
									 int[] inTreeList, int inStartIndex, int inEndIndex) {
		if (preStartIndex > preEndIndex) {
			return null;
		}
		// 获取根节点在前序遍历和中序遍历的位置
		// 前序遍历中第一个元素为根节点
		int rootValue = preTreeList[preStartIndex];
		int index = inStartIndex;
		while (index < inEndIndex && rootValue != inTreeList[index]) {
			index++;
		}
		TreeNode rootNode = new TreeNode();
		rootNode.value = rootValue;
		rootNode.leftNode = construct(preTreeList, preStartIndex + 1, preStartIndex + index - inStartIndex,
				                      inTreeList, inStartIndex, index - 1);
		rootNode.rightNode = construct(preTreeList, preStartIndex + index - inStartIndex + 1, preEndIndex,
				                       inTreeList, index + 1, inEndIndex);
		return rootNode;
	}

	public static void printTree(TreeNode tree) {
		if (tree != null) {
			System.out.print(tree.value);
			printTree(tree.leftNode);
			printTree(tree.rightNode);
		}
	}

	public static void main(String[] args) {
		int[] preTreeList = {1, 2, 4, 7, 3, 5, 6, 8};
		int[] inTreeList = {4, 7, 2, 1, 5, 3, 8, 6};
		TreeNode treeNode = construct(preTreeList, 0, preTreeList.length - 1, inTreeList, 0, inTreeList.length - 1);
		printTree(treeNode);
	}

}
