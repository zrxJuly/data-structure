package com.zrxjuly.ds.arrayandstring.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author zrxJuly
 * @Date 2018-8-20 14:54:31
 * @Description 动态数组
 *   大小可变的随机存取的列表数据结构.
 *
 */
public class DynamicArray {
	/**
	 * 动态数组：大小可变的随机存取的列表数据结构.
	 */
	public static void dynamicArray() {
		// 1. 集合初始化.
        List<Integer> v0 = new ArrayList<>();
        List<Integer> v1;
        // 声明并赋值数组.
        Integer[] a = {0, 1, 2, 3, 4};
        // Arrays.asList()方法：将数组转化为List，该方法将数组与列表链接起来，当更新其中一个时，另一个也会更新.
        v1 = new ArrayList<>(Arrays.asList(a));
        // 3. 将v1数组赋值给v2
        List<Integer> v2 = v1;                      // another reference to v1
        List<Integer> v3 = new ArrayList<>(v1);     // make an actual copy of v1
        // 3. get length
        System.out.println("The size of v1 is: " + v1.size());;
        // 4. access element
        System.out.println("The first element in v1 is: " + v1.get(0));
        // 5. iterate the vector.下面两种方法遍历集合内容.
        System.out.print("[Version 1] The contents of v1 are:");
        for (int i = 0; i < v1.size(); i ++) {
            System.out.print(" " + v1.get(i));
        }
        System.out.println();
        System.out.print("[Version 2] The contents of v1 are:");
        for (int item : v1) {
            System.out.print(" " + item);
        }
        
        System.out.println();
        // 6. modify element.修改元素，注意：v1使用Arrays.asList()方法赋值，因此v2中的元素修改后，v1也会修改
        v2.set(0, 5);       // modify v2 will actually modify v1
        System.out.println("The first element in v1 is: " + v1.get(0));
        v3.set(0, -1);
        System.out.println("The first element in v1 is: " + v1.get(0));
        // 7. sort. 对集合进行排序
        Collections.sort(v1);
        // 8. add new element at the end of the vector
        v1.add(-1);
        System.out.print("[Version 2] The contents of v1 are:");
        for (int item : v1) {
            System.out.print(" " + item);
        }
        System.out.println();
        v1.add(1, 6);
        System.out.print("[Version 2] The contents of v1 are:");
        for (int item : v1) {
            System.out.print(" " + item);
        }
        System.out.println();
        // 9. delete the last element
        v1.remove(v1.size() - 1);
        System.out.print("[Version 2] The contents of v1 are:");
        for (int item : v1) {
            System.out.print(" " + item);
        }
	}
	
	public static void main(String[] args) {
		dynamicArray();
	}
}
