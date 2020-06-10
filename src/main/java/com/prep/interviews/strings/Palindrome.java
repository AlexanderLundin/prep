package com.prep.interviews.strings;

// find all palindromes in a string
public class Palindrome {

    public static Integer count(String inputString) {
        int count = 0;
        String character = "";
        String subString = "";
        for (int i = 0; i < inputString.length() ; i++) {
            character = inputString.substring(i, i + 1);
            // if character is palindrome, increment
            if (isPalindrome(character)){
                count++;
            }
            for (int j = i + 1; j < inputString.length(); j++) {
                subString = inputString.substring(i, j + 1);
                //if substring is palindrome, increment
                if (isPalindrome(subString)){
                    count++;
                }
            }

        }
        return count;
    }

    public static boolean isPalindrome (String inputString){
        String forwards = inputString;
        String backwards = "";
        String character = "";

        for (int i = 0; i < inputString.length() ; i++) {
            character = inputString.substring(i, i + 1);
            backwards = character + backwards;
        }

        if (forwards.equals(backwards)){
            return true;
        }

        return false;
    }
}
