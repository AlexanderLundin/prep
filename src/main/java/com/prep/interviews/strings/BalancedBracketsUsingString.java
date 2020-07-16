package com.prep.interviews.strings;

public class BalancedBracketsUsingString {
    // https://github.com/eugenp/tutorials/tree/master/algorithms-miscellaneous-6/src/main/java/com/baeldung/algorithms/balancedbrackets
    public static boolean isBalanced(String str) {
        if (null == str || ((str.length() % 2) != 0)) {
            return false;
        } else {
            char[] ch = str.toCharArray();
            for (char c : ch) {
                if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                    return false;
                }

            }
        }

        while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
            str = str.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }
        return (str.length() == 0);

    }

    // driver function
    public static void main(String[] args)
    {
        boolean result = isBalanced("{[()]}");
        System.out.println("String balance result: " + result);
    }
}
