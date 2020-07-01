package com.prep.interviews.strings;

// 07/01/2020 Ebay Backend Developer HackerRank Screen Exam

// encrypt string by
// reversing and converting uppercase to lowercase
public class StringEncrypter {

    public static String Encrypt(String name) {
        boolean validated = true;
        String encrypted;
        if (validated) {
            encrypted = doEncryption(name);
        } else {
            throw new IllegalArgumentException("Try with valid name");
        }
        return encrypted;
    }

    private static String doEncryption(String name) {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder = builder.reverse();
        return builder.toString().toLowerCase();
    }
}
