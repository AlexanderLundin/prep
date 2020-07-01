package com.prep.interviews.arrays;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// 07/01/2020 Ebay Backend Developer HackerRank Screen Exam

// https://www.geeksforgeeks.org/minimum-number-of-distinct-elements-after-removing-m-items/
public class MinimumNumberOfDistinctAfterRemoval {
    // Function to find distinct id's
    static int distinctIds(int arr[], int mi) {

        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int count = 0;

        // Store the occurrence of ids
        for (int i = 0; i < arr.length; i++) {

            // If the key is not add it to map
            if (m.containsKey(arr[i]) == false) {
                m.put(arr[i], 1);
            }

            // If it is present then increase the value by 1
            else m.put(arr[i], m.get(arr[i]) + 1);
        }

        int minKey;
        int valueAtMinKey;
        int newValue;
        do {
            minKey = minKeyUsingStreamAndMethodReference(m);
            valueAtMinKey = m.get(minKey);
            newValue = valueAtMinKey - 1;
            if (newValue == 0) {
                m.remove(minKey);
            } else {
                m.put(minKey, newValue);
            }
            mi--;
        } while (mi > 0);

        return m.size();
    }

    // https://www.baeldung.com/java-find-map-max
    public static <K, V extends Comparable<V>> K minKeyUsingStreamAndMethodReference(Map<K, V> map) {
        Optional<Map.Entry<K, V>> minEntry = map.entrySet()
                .stream()
                .min(Comparator.comparing(Map.Entry::getValue));
        return minEntry.get().getKey();
    }

    //Driver method to test above function
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = {2, 3, 1, 2, 3, 3};
        int m = 3;

        System.out.println(distinctIds(arr, m));
    }
}
