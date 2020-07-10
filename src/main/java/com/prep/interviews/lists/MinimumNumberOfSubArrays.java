package com.prep.interviews.lists;

// Java implementation of the approach
import java.util.*;

//07-09-2020 Amazon

//https://www.quora.com/How-do-I-convert-a-character-array-into-an-integer-array-in-Java
//https://www.techiedelight.com/print-sub-arrays-array-distinct-elements/
public class MinimumNumberOfSubArrays {


    // Utility function to print the sub-array formed by A[i, j]
    public static List<Integer> printSubArray(int[] A, int i, int j, int n)
    {
        List<Integer> myList = new ArrayList<>();
        if (i < 0 || i > j || j >= n) { // invalid input
            return myList;
        }

        for (int index = i; index < j; index++) {
            System.out.print(A[index] + ", ");
            myList.add(A[index]);
        }

        System.out.println(A[j]);
        return myList;
    }

    // Function to print all sub-arrays having distinct elements
    public static List<Integer> calculate(int[] A)
    {
        List<Integer> totalCounts = new ArrayList<>();
        int n = A.length;

        // Map to mark elements as visited in the current window
        Map<Integer, Boolean> visited = new HashMap<>();

        // put all elements in a map
        for (int val: A) {
            visited.put(val, false);
        }

        // points to left and right boundary of the current window
        // i.e. current window is formed by A[left, right]
        int right = 0, left = 0;

        // loop until right index of the current window is less
        // than the maximum index
        List<Integer> myList;
        while (right < n)
        {
            // keep increasing the window size if all elements in the
            // current window are distinct
            while (right < n && !visited.get(A[right]))
            {
                visited.put(A[right], true);
                right++;
            }

            myList = printSubArray(A, left, right - 1, n);
            totalCounts.add(myList.size());
            // As soon as duplicate is found (A[right]),
            // terminate the above loop and reduce the window's size
            // from its left to remove the duplicate

            while (right < n && visited.get(A[right]))
            {
                visited.put(A[left], false);
                left++;
            }
        }
        return totalCounts;
    }

    public static int[] charArrayToIntArray(char[] jcdCharArray){
        //Define an integer array based on size of original numbers
        int[] jcdIntegerArray = new int[jcdCharArray.length];
        //For loop to populate integer array
        for (int i = 0; i < jcdCharArray.length; i++) {
            jcdIntegerArray[i] = (int)jcdCharArray[i] - 48;
        }
        return jcdIntegerArray;
    }

    public static void main(String[] args)
    {
        //char[] chars = { '5', '2', '3', '5', '4', '3' };

        char[] chars = { '5', '2', '3', '5', '4', '3' };
        int[] ints = charArrayToIntArray(chars);
        List<Integer> totalCounts = calculate(ints);
        System.out.println(totalCounts);
    }
}
