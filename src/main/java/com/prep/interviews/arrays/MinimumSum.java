package com.prep.interviews.arrays;

import java.util.Collections;
import java.util.List;

public class MinimumSum {
    /*
     * Complete the 'minSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY num
     *  2. INTEGER k
     */

    public static int minSum(List<Integer> num, int k) {
        // Write your code here
        num = sort(num);
        int leastValue;
        double divisionResult;
        int ceiling;
        for (int i = 0; i < k; i++) {
            leastValue = num.get(0);
            divisionResult = leastValue / 2.0;
            ceiling = (int) Math.ceil(divisionResult);
            num.remove(0);
            num.add(ceiling);
            // performance of this method could be improved by removing sorting from inside loop
            num = sort(num);
        }
        int sum = 0;
        for (int i = 0; i < num.size(); i++) {
            sum = sum + num.get(i);
        }
        return sum;
    }

    public static List<Integer> sort(List<Integer> num){
        Collections.sort(num);
        Collections.reverse(num);
        return num;
    }
}
