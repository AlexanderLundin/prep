package com.prep.interviews.pair;

import java.util.ArrayList;
import java.util.List;

// 07-21-2020
// Amazon tech screen
public class LargestAssociationList {

    static class PairString{
        String first;
        String second;
        PairString(String first, String second){
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "PairString{" +
                    "first='" + first + '\'' +
                    ", second='" + second + '\'' +
                    '}';
        }
    }

    List<String> largestItemAssociation(List<PairString> itemAssociation)
    {
        if (itemAssociation == null){
            return null;
        }

        PairString itemI;
        PairString itemJ;

        List<String> currentItemAssociation = new ArrayList<>();
        List<String> maxItemAssociation = new ArrayList<>();
        List<List<String>> accumulatedItemAssociations = new ArrayList<>();

        // WRITE YOUR CODE HERE
        for (int i = 0; i < itemAssociation.size(); i++) {
            itemI = itemAssociation.get(i);
            currentItemAssociation = new ArrayList<>();
            currentItemAssociation.add(itemI.first);
            currentItemAssociation.add(itemI.second);
            for (int j = i + 1; j < itemAssociation.size(); j++) {
                itemJ = itemAssociation.get(j);

                if(itemI.first.equals(itemJ.first)  || itemI.first.equals(itemJ.second)){
                    currentItemAssociation.add(itemJ.first);
                }
                if(itemI.second.equals(itemJ.first) || itemI.second.equals(itemJ.second)){
                    currentItemAssociation.add(itemJ.second);
                }
            }
            if (currentItemAssociation.size() > maxItemAssociation.size()){
                maxItemAssociation = currentItemAssociation;
            }
            accumulatedItemAssociations.add(currentItemAssociation);
        }

        return maxItemAssociation;

    }
    // METHOD SIGNATURE ENDS


    public static void main(String[] args) {

        List<PairString> itemAssociation = new ArrayList<>();
        itemAssociation.add(new PairString("Item1", "Item2"));
        itemAssociation.add(new PairString("Item3", "Item4"));
        itemAssociation.add(new PairString("Item4", "Item5"));

        LargestAssociationList test = new LargestAssociationList();

        List<String> output = test.largestItemAssociation(itemAssociation);

        String str;
        System.out.println("Output is: ");
        for (int i = 0; i < output.size(); i++) {
            str = output.get(i);
            System.out.println(str);
        }



    }
}
