package com.zrxjuly.ds.arrayandstring.study;

import java.util.Arrays;
/**
 * 
 * @author: zrxJuly
 * @Date: 2018-8-20 14:30:20
 * @Description 
 *   数组的基本用法.
 *     数组 是一种基本的数据结构，用于按顺序存储元素的集合.
 *     数组中的每个元素都可以通过数组索引来识别，元素可以随机存取.
 *     数组可以有一个或多个维度.
 */
public class Array {
	/**
	 * 一维数组：一维数组也被称为线性数组.
	 *   数组具有固定的容量，我们需要在初始化时指定数组的大小.
	 *   然而这种在初始化时指定数组大小的方法会很不方便甚至可能会造成浪费.
	 */
	public static void arrayTest() {
		// 1. Initialize.初始化数组.
		int[] a0 = new int[5];
		int[] a1 = { 1, 2, 3 };
		// 2. Get Length.输出数组长度.
		System.out.println("The size of a1 is: " + a1.length);
		// 3. Access Element.访问数组元素.
		System.out.println("The first element is: " + a1[0]);
		// 4. Iterate all Elements.遍历所有元素，两个for循环，两种遍历方法.
		System.out.print("[Version 1] The contents of a1 are:");
		for (int i = 0; i < a1.length; ++i) {
			System.out.print(" " + a1[i]);
		}
		System.out.println();
		System.out.print("[Version 2] The contents of a1 are:");
		for (int item : a1) {
			System.out.print(" " + item);
		}
		System.out.println();
		// 5. Modify Element.修改指定下标的数组元素.
		a1[0] = 4;
		// 6. Sort.对数组进行排序.
		Arrays.sort(a1);
	}
	
	public static void main(String[] args) {
		arrayTest();
	}
}
