package com.prep.leetcode.medium.array;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int area = 0;
        Integer outerValue = 0;
        Integer innnerValue = 0;
        Integer heightValue = 0;
        Integer lengthValue = 0;
        for (int i = 0; i < height.length; i++) {
            outerValue = height[i];
            for (int j = i + 1; j < height.length; j++) {
                innnerValue = height[j];
                heightValue = Integer.min(outerValue, innnerValue);
                lengthValue = j - i;
                area = heightValue * lengthValue;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }
}
