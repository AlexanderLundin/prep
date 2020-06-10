package com.prep.hackerrank.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution{    public static void main(String []args)
{
    HashMap map = new HashMap();
    Scanner in = new Scanner(System.in);
    System.out.println("waiting for input");
    int n=in.nextInt();
    in.nextLine();
    for(int i=0;i<n;i++)
    {
        String name=in.nextLine();
        int phone=in.nextInt();
        map.put(name, phone);
        in.nextLine();
    }
    while(in.hasNext())
    {
        String s=in.nextLine();
        if (map.containsKey(s)){
            Integer value = (Integer) map.get(s);
            System.out.println(s+"="+value);
        }else{
            System.out.println("Not found");
        }

    }
}

}
