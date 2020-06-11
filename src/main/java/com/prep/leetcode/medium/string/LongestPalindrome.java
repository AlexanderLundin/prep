package com.prep.leetcode.medium.string;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        String innerString = "";
        String longestPalindrome = "";
        for (int i = 0; i < s.length() ; i++) {
            for (int j = i; j < s.length() ; j++) {
                innerString = s.substring(i, j);
                if (isPalindrome(innerString) && innerString.length() > longestPalindrome.length()){
                    longestPalindrome = innerString;
                }
            }

        }
        return longestPalindrome;
    }

    public boolean isPalindrome (String s){
        String reverse = "";
        String valueAtIndex = "";
        for (int i = s.length(); i > 0 ; i--) {
            valueAtIndex = s.substring(i - 1, i);
            reverse = reverse + valueAtIndex;
        }
        if (reverse.equals(s)){
            return true;
        }else{
            return false;
        }
    }
}
