package com.prep.hackerrank.arrays;

import java.util.Scanner;

public class SubArray {
    public static int countNegativeSubArrays(int[] array) {
        int sum = 0;
        int count = 0;
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = i; j < array.length; j++) {
                value = array[j];
                sum += value;
                if (sum < 0){
                    count++;
                }
            }
        }
        return count;
    }
}

class Solution2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int value = 0;
        int[] array = new int[n];
        for (int i = 0; i < n ; i++) {
            value = scan.nextInt();
            array[i] = value;
        }
        int countOfNegativeSubArrays = SubArray.countNegativeSubArrays(array);
        System.out.println(countOfNegativeSubArrays);
    }
}