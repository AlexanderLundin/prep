package com.prep.hackerrank.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {

    public static void main(String[] arg) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        //System.out.println("waiting for input: ");
        int n = scanner.nextInt();
        Integer[] arrayOfNumbers = new Integer[n];
        ArrayList listOfNumbers = new ArrayList<Integer>();
        for (int i = 0; i < n ; i++) {
            listOfNumbers.add(scanner.nextInt());
        }
        arrayOfNumbers = (Integer[]) listOfNumbers.toArray(arrayOfNumbers);

        int q = scanner.nextInt();
        String type;
        Integer[] item = new Integer[3];
        Integer[][] arrayOfQueries = new Integer[q][3];

        ArrayList listOfUserInput = new ArrayList<Integer>();
        for (int i = 0; i < q ; i++) {
            //System.out.println("waiting for next line: ");
            type = scanner.next();
            if (type.equals("Insert")){
                item[0] = 1;
            }else{
                item[0] = 0;
            }
            //System.out.println("waiting for next int: ");
            listOfUserInput = new ArrayList<Integer>();
            listOfUserInput.add(scanner.nextInt());
            item[1] = (Integer) listOfUserInput.get(0);
            if (type.equals("Insert")){
                listOfUserInput.add(scanner.nextInt());
                item[2] = (Integer) listOfUserInput.get(1);
            }
            arrayOfQueries[0] = item;
            if (type.equals("Insert")){
                ChallengeList.insert(item[1], item[2], listOfNumbers);
            }else{
                ChallengeList.delete(item[1], listOfNumbers);
            }
        }
        int value = 0;
        String string = "";
        for (int i = 0; i < listOfNumbers.size() ; i++) {
            value = (int) listOfNumbers.get(i);
            string += value + " ";
        }
        System.out.println(string);
    }
}

public class ChallengeList {
    public static void insert(int index, int value, ArrayList list){
        if (index >= list.size()){
            list.add(value);
        }else{
            list.set(index, value);
        }
    }

    public static void delete (int index, ArrayList list){
        if (index < list.size()){
            list.remove(index);
        }
    }
}
