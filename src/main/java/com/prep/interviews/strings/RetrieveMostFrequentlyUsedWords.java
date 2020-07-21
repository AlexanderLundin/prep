package com.prep.interviews.strings;

import com.prep.interviews.warmups.Default;

import java.util.*;

// 07-21-2020
// Amazon tech screen
public class RetrieveMostFrequentlyUsedWords {

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<String> retrieveMostFrequentlyUsedWords(String helpText,
                                                 List<String> wordsToExclude)
    {
        // WRITE YOUR CODE HERE

        // regex remove all apostrophes
        helpText = helpText.replaceAll("[' ]", " ");

        // removes all non-letter characters, folds to lowercase, then splits the input, doing all the work in a single line:
        String[] helpArray = helpText.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");


        HashMap<String, Integer> occurrences = new HashMap<String, Integer>();

        for (String word: helpArray) {
            int value = 0;
            if  ((occurrences.containsKey(word)) && !isStringInArrayList(word, wordsToExclude)) {
                value = occurrences.get(word);
            }
            occurrences.put(word, value + 1);
        }

        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(occurrences.entrySet());

        // Sort the list in increasing order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        // reverse
        Collections.reverse(list);

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        List<String> output = new ArrayList<>();
        Set<String> keys = temp.keySet();
        int i = 0;
        int max = 0;
        int count = 0;
        for(String key: keys){
            count = temp.get(key);
            if (i == 0){
                max = count;
                output.add(key);
            }else if (count == max){
                output.add(key);
            }
            i++;
        }
        return output;
    }
    // METHOD SIGNATURE ENDS

    public boolean isStringInArrayList (String input, List<String> arrayList){
        String value;
        for (int i = 0; i < arrayList.size(); i++) {
            value = arrayList.get(i);
            if (input.toLowerCase().equals(value.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    public static void main (String[] args){
//        String helpText = "Purchase Order Item Help can't find item item is too much part of purchase need fix for image item to be delivered to fast purchase order too big is Purchase coming? too big why";
//        List<String> wordsToExclude = new ArrayList<>();
//        wordsToExclude.add("help");
//        wordsToExclude.add("fix");
//        wordsToExclude.add("to");
//        wordsToExclude.add("is");
//        wordsToExclude.add("of");


//        String helpText = "Rose is a flower red rose are flower";
//        List<String> wordsToExclude = new ArrayList<>();
//        wordsToExclude.add("is");
//        wordsToExclude.add("are");
//        wordsToExclude.add("a");

        String helpText = "Jack and Jill went to the market to buy bread and cheese. Cheese is Jack's and Jill's favorite food.";
        List<String> wordsToExclude = new ArrayList<>();
        wordsToExclude.add("is");
        wordsToExclude.add("and");
        wordsToExclude.add("he");
        wordsToExclude.add("the");
        wordsToExclude.add("to");

        List<String> output = new ArrayList<>();
        RetrieveMostFrequentlyUsedWords test = new RetrieveMostFrequentlyUsedWords();
        output = test.retrieveMostFrequentlyUsedWords(helpText, wordsToExclude);
        System.out.println("Output is: " + output);
    }
}
