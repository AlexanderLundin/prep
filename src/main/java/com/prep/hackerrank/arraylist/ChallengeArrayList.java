package com.prep.hackerrank.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ChallengeArrayList {
    
    public static Integer[][] toQueryArrays(ArrayList arrayList){
        int i = 0;
        int arrayCount = 0;
        Integer n = (int) arrayList.get(i);
        int length;
        int q;
        int value;
        Integer arrays [][] = new Integer [++n][];
        arrays[arrayCount] = new Integer[]{--n};
        arrayCount++;
        Integer[] array;
        i++;
        for (arrayCount = 1; arrayCount <= n ; arrayCount++) {
            array = new Integer[2];
            q = (Integer) arrayList.get(i);
            array[0] = q;
            i++;
            value = (Integer) arrayList.get(i);
            array[1] = value;
            i++;
            arrays[arrayCount] = array;
        }
        return arrays;
    }
    
    public static Integer[][] toIntArrays(ArrayList arrayList){
        int i = 0;
        int arrayCount = 0;
        Integer n = (int) arrayList.get(i);
        int length;
        int d;
        Integer arrays [][] = new Integer [++n][];
        arrays[arrayCount] = new Integer[]{--n};
        arrayCount++;
        Integer array [];
        i++;
        for (arrayCount = 1; arrayCount <= n ; arrayCount++) {
            d = (Integer) arrayList.get(i);
            length = d;
            array = new Integer [++length];
            array[0] = d;
            i++;
            for (int j = 2; j < length + 1 ; j++) {
                array[j - 1] = (Integer) arrayList.get(i);
                i++;
            }
            arrays[arrayCount] = array;
        }
        return arrays;
    }

    public static void printValueAtXY(Integer[][] arrays, int x, int y) {
        Integer array[];
        array = arrays[x];
        if (array.length <= y){
            System.out.println("ERROR!");
        }else{
            String value = Integer.toString(array[y]);
            System.out.println(value);
        }
    }
}

class Solution {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        arrayList.add(n);
        int d = 0;
        int value = 0;
        for (int i = 0; i < n ; i++) {
            d = scan.nextInt();
            arrayList.add(d);
            for (int j = 0; j < d ; j++) {
                value = scan.nextInt();
                arrayList.add(value);
            }
        }
        Integer[][] numberArrays = ChallengeArrayList.toIntArrays(arrayList);
        System.out.println(numberArrays);
        arrayList = new ArrayList();
        // loop for queries
        n = scan.nextInt();
        arrayList.add(n);
        int q = 0;
        for (int i = 0; i < n ; i++) {
            q = scan.nextInt();
            arrayList.add(q);
            value = scan.nextInt();
            arrayList.add(value);
        }
        Integer[][] queryArrays = ChallengeArrayList.toQueryArrays(arrayList);
        Integer[] queryArray;
        int x;
        int y;
        for (int i = 1; i < queryArrays.length ; i++) {
            queryArray = queryArrays[i];
            x = queryArray[0];
            y = queryArray[1];
            ChallengeArrayList.printValueAtXY(numberArrays, x, y);
        }

    }
}