package com.summary.java.base.loop;

/**
 * 
 * @Description： while循环 
 * 
 * while循环语句是先判断后执行循环语句的；
 * 
 * do-while循环是先执行后判断，不管条件是否满足至少执行一次。
 * 
 * @author [ Wenfeng.Huang ] on [2019年12月3日上午10:43:39]
 * @Modified By： [修改人] on [修改日期] for [修改说明]
 *
 */
public class WhileLoop {

	public static void main(String[] args) {
		int arr[] = { 56, 33, 51, 49, 102, 23 };// 定义一个数组
		bubbleSort(arr);
	}

	public static void bubbleSort(int arr[]) {
		// while循环冒泡排序（大到小）
		int i = 0;
		while (i < arr.length - 1) {// 外层循环控制
			int j = 0; // 不能在外面定义
			while (j < arr.length - i - 1) {// 内层循环控制
				if (arr[j] < arr[j + 1]) {// 哪两个数进行比较
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				j++;
			}
			i++;
		}
	}
}
