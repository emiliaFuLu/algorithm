package com.fl.leetcode.easy;

import java.util.*;

/**
 * twoSum
 *
 * @author fulu
 * @date 2022/6/30 16:53
 * @description 两数之和
 */
public class twoSum {

    public static void main(String[] args) {
        var nums = new int[]{2,7,11,15};
        int[] list = twoSum(nums, 9);
        System.out.println(Arrays.toString(list));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] in = new int[0];

        for (int i = 0; i < nums.length; i++) {

            var num = target - nums[i];
            Integer tmp = map.putIfAbsent(num, i);
            if (tmp != null) {
                in = new int[]{map.get(num), i};
            }
        }
        return in;
    }
}
 