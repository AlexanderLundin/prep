package com.prep.interviews.strings;

public class ReverseNumber {
    // https://www.geeksforgeeks.org/write-a-program-to-reverse-digits-of-a-number/
    // Time Complexity: O(Log(n)) where n is the input number.
    /* Iterative function to reverse digits of num*/
    static int reversDigits(int num)
    {
        int rev_num = 0;
        while(num > 0)
        {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    // Driver code
    public static void main (String[] args)
    {
        int num = 4562;
        System.out.println("Reverse of no. is "
                + reversDigits(num));
    }
}
