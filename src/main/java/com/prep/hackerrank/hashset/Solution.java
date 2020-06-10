package com.prep.hackerrank.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        System.out.println("waiting for input");

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet set = new HashSet();
        for (int i = 0; i < t; i++) {
            String item = pair_left[i] + pair_right[i];
            if (!set.contains(item)){
                set.add(item);
            }
            System.out.println(set.size());
        }

    }
}
