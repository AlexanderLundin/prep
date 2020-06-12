package com.prep.leetcode.medium.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int value;
        int x = 0;

        List<List<Integer>> solutions = new ArrayList<>();
        for (int i = 0; i < (nums.length - 1); i++) {
            value = nums[i];
            HashSet<Integer> s = new HashSet<Integer>();
            for (int j = i + 1; j < nums.length; j++) {
                x = -(nums[i] + nums[j]);
                if (s.contains(x)){
                    List<Integer> solution = new ArrayList<>();
                    solution.add(nums[i]);
                    solution.add(nums[j]);
                    solution.add(x);
                    solutions.add(solution);
                }else{
                    s.add(nums[j]);
                }
            }
        }
        return solutions;
    }
}
