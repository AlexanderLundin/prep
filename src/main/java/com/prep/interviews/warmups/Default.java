package com.prep.interviews.warmups;

public class Default {
    
    public void printer (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main (String[] args){
        System.out.println("Hello");
        int[] arr = {1,2,3};
        Default test = new Default();
        test.printer(arr);
    }
}
