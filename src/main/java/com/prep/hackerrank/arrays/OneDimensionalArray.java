package com.prep.hackerrank.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OneDimensionalArray {
    private int[] array;

    public OneDimensionalArray(int size) {
        array = new int[size];
    }

    public int getSize() {
        return array.length;
    }

}

class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int value;
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            value = scan.nextInt();
            a[i] = value;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}