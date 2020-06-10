package com.prep.hackerrank.arrays;

public class TwoDimensionalArrays {
    public static int sumOfLargestHourGlass(int[][] array) {
        int individualSum = 0;
        int max = 0;
        for (int row = 0; row < array.length ; row++) {
            for (int column = 0; column < array[0].length ; column++) {
                individualSum = sumOfHourGlass(row, column, array);
                if (individualSum > max){
                    max = individualSum;
                }
            }
        }
        return max;
    }

    public static int sumOfHourGlass (int row, int column, int[][] array){
        if (row > 3) return 0;
        if (column > 3) return 0;
        int sum =   array[row][column] +  array[row][column + 1] + array[row][column + 2] +
                                        array[row + 1][column + 1] +
                    array[row + 2][column] +  array[row + 2][column + 1] + array[row + 2][column + 2];
        return sum;
    }
}
