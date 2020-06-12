package com.prep.interviews.strings;

public class MettleTest2 {
    int[] leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            arr = leftRotatebyOne(arr, n);
        return arr;
    }

    int[] leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
        return arr;
    }

    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}
