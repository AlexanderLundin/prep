package com.prep.leetcode.medium.string;

public class LongestSubstringNoRepeats {

    public static int lengthOfLongestSubstring(String input) {
        int maxLength = 0;
        int currentLength = 0;
        String substringWithoutRepeats = "";
        String letter = "";
        for (int i = 0; i < input.length(); i++) {

            letter = input.substring(i, i + 1);

            for (int j = i; j < input.length() ; j++) {
                letter = input.substring(j, j + 1);
                // break out of loop
                if (substringWithoutRepeats.contains(letter)){
                    currentLength = substringWithoutRepeats.length();
                    break;
                }else{
                    substringWithoutRepeats = input.substring(i, j + 1);
                }
            }
            // update max length
            if (currentLength > maxLength){
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
}
