package com.zrxjuly.ds.arrayandstring.demo;

/**
 * 
 * @author: zrxJuly
 * @Date: 2018-8-21 17:00:55
 * @Desription: Find Pivot Index. 寻找数组的中心索引。
 *   Coding Question:
 *       Given an array of integers nums, write a method that returns the "pivot" index of this array.
 *       We define the pivot index as the index where the sum of the numbers to the left of the index 
 *       is equal to the sum of the numbers to the right of the index.
 *       If no such index exists, we should return -1. 
 *       If there are multiple pivot indexes, you should return the left-most pivot index.
 *   |-题目：寻找数组的中心索引。
 *       给定一个整数类型的数组，编写一个返回数组中心索引的方法。
 *       数组中心索引的定义：索引左侧的数的总和 = 索引右侧的数的总和。
 *       如果不存在这样的索引，返回-1.
 *       如果存在多个中心索引，应该返回最左侧的中心索引。
 * 
 */
public class FindPivotIndex {
	/**
	 * Solution 1.
	 * |-思路分析：目标索引的左侧的数的总和 = 目标索引的右侧的数的总和.
	 *     数组：[1, 7, 3, 6, 5, 6 ]
	 *          |_____|  |  |__|
	 *             |     |    |
	 *             A     B    C 
	 *     假设 A：目标索引左侧的总和，C:目标索引右侧总和，B：目标索引对应的数值.
	 *     则 若有：A = C， 符合题意，返回B的索引，否则返回-1.
	 * |- 分别声明左侧总和numsLeft 以及 右侧总和numsRight 两个变量，for循环分别遍历两侧元素，最后比较是否相等.
	 * @param nums
	 * @return
	 */
	public static int pivotIndexSolution1(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			// 声明左侧变量.
			int numsLeft = 0;
			// 声明右侧变量.
			int numsRight = 0;
			// 遍历i左侧元素，值相加.
			for (int m = 0; m < i; m++) {
				numsLeft += nums[m];
			}
			// 遍历i右侧元素，值相加.
			for (int n = nums.length - 1; n > i; n--) {
				numsRight += nums[n];
			}
			// 若左侧值和右侧值相等，返回i值.
			if (numsLeft == numsRight) {
				return i;
			}
		}

		return -1;
	}
	
	/**
	 * Solution 2.
	 * |-思路分析：左侧及索引对应的数 的总和 = 总和-左侧及索引对应的数的总和+索引对应的数.
	 *   |-下面这样解释更容易理解：
	 *     数组：[1, 7, 3, 6, 5, 6 ]
	 *          |_____|  |  |__|
	 *             |     |    |
	 *             A     B    C 
	 *     假设 A：目标索引左侧的总和，C:目标索引右侧总和，B：目标索引对应的数值.
	 *     则 若有：A + B = B + C，即 A = C， 符合题意，返回B的索引，否则返回-1.
	 *     
	 *   |-下面代码中是这样判断的：
	 *     分别声明两个变量：数组总和sum 以及 数组左侧总和 lsum
	 *     先用for循环遍历得出数组总和sum，然后再写一个for循环，在该循环内判断左侧总和lsum是否和右侧总和相等。
	 *     (注：本例中lsum包含了目标索引的值，因此在判断的时候右侧总和也必须加上目标索引的值)
	 *     
	 * @param nums
	 * @return
	 */
	public static int pivotIndexSolution2(int[] nums) {
		int len = nums.length;
		// 数组总和.
        int sum = 0;
        // 数组左侧数的总和.
        int lsum = 0;
        // 得出数组总和.
        for(int x:nums){
            sum+=x;
        }
        
        for(int i = 0;i<len;i++){
            lsum += nums[i];
            // 判断：左侧总和 == 右侧总和
            if(lsum == sum - lsum + nums[i]){
                return i;
            }
        }
        
        return -1;
	}
	
	public static void main(String[] args) {
		// Initialize.初始化数组.
        int[] nums = {1, 7, 3, 6, 5, 6};
//		int[] nums = {-1,-1,-1,0,1,1};
		// 调用方法一：
        int result1 = pivotIndexSolution1(nums);
        System.out.println("The first method result is:" + result1);
        // 调用方法二：
        int result2 = pivotIndexSolution2(nums);
        System.out.println("The second method result is:" + result2);
	}
}
