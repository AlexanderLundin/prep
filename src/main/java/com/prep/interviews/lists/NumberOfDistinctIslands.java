package com.prep.interviews.lists;


import java.util.*;
//07-09-2020 Amazon
//https://algorithms.tutorialhorizon.com/find-the-number-of-distinct-islands-or-connected-components/
public class NumberOfDistinctIslands {

    static class Pair<I extends Number, I1 extends Number> {
        public Pair(I1 i, I1 i1) {
        }

        // Return a map entry (key-value pair) from the specified values
        public static <T, U> Map.Entry<T, U> of(T first, U second)
        {
            return new AbstractMap.SimpleEntry<>(first, second);
        }
    }

    public void findDistinctIslands(int rows, int cols, List<List<Integer>> inputList){

        Integer[][] grid = TwoDimensionalListToTwoDimensionalArray(inputList);

        rows = grid.length;
        if (rows == 0)
            return;

        cols = grid[0].length;

        //created visited array
        boolean[][] visited = new boolean[rows][cols];

        //create set that will store unique islands
        //pair will store each coordinate in island
        //all of pairs constructing island will be stored in arraylist
        //Set will maintain the unique islands in the form of arraylist
        Set<ArrayList<Pair<Integer, Integer>>> islands = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //check if current coordinates can be start of undiscovered island
                if (grid[i][j] == 1 && !visited[i][j]) {
                    //fix the starting point for island
                    int start_x = i;
                    int start_y = j;
                    ArrayList<Pair<Integer, Integer>> island = new ArrayList<>();
                    findIsland(grid, i, j, start_x, start_y, visited, island);

                    //add the found island
                    islands.add(island);
                }
            }
        }

        if (islands.size() > 0) {
            System.out.println("No of unique distinct islands are: " + islands.size());
        } else {
            System.out.println("No island in the given grid");
        }
    }

    public void findIsland(Integer[][] grid, int row, int col, int start_x, int start_y, boolean[][] visited, ArrayList<Pair<Integer, Integer>> island) {

        int H = grid.length;
        int L = grid[0].length;

        if (row < 0 || col < 0 || row >= H || col >= L || visited[row][col] || grid[row][col] == 0)
            return;

        //add island coordinates (base coordinates) in list
        island.add(new Pair<>(row - start_x, col - start_y));

        //mark the cell visited
        visited[row][col] = true;
        findIsland(grid, row + 1, col, start_x, start_y, visited, island); // go right
        findIsland(grid, row - 1, col, start_x, start_y, visited, island); //go left
        findIsland(grid, row, col + 1, start_x, start_y, visited, island); //go down
        findIsland(grid, row, col - 1, start_x, start_y, visited, island); // go up
    }




     public static Integer[][] TwoDimensionalListToTwoDimensionalArray (List<List<Integer>> list){

         Integer[][] array = new Integer[list.size()][];
         int i = 0;
         for (List<Integer> nestedList : list) {
             array[i++] = nestedList.toArray(new Integer[nestedList.size()]);
         }
         return array;
    }

    public static void main(String[] args) {

        Integer[][] grid = {
                {1, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1},
                {1, 0, 1, 1},
                {1, 1, 1, 1}
        };
        List<List<Integer>> inputList = TwoDimensionalArrayToTwoDimensionalList(grid);
        NumberOfDistinctIslands n = new NumberOfDistinctIslands();


        //n.findDistinctIslands(grid);
        n.findDistinctIslands(3, 4, inputList);
    }

    public static List<List<Integer>> TwoDimensionalArrayToTwoDimensionalList(Integer[][] array){
        List<List<Integer>> newList = new ArrayList<>();
        for (Integer[] ints : array) {
            newList.add(Arrays.asList(ints));
        }
        return newList;
    }
}
