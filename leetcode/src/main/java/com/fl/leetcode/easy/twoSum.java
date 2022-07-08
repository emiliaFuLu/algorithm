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
        var nums = new int[]{3, 3};
        int[] list = twoSum(nums, 6);
        System.out.println(Arrays.toString(list));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        map.put(nums[0], 0);
        int[] in = new int[0];

        for (int i = 1; i < nums.length; i++) {

            var num = target - nums[i];
            Integer exist = map.get(num);
            if (exist != null) {
                in = new int[]{map.get(num), i};
                break;
            }
            map.put(nums[i], i);
        }
        return in;
    }
}
 