package com.prep.interviews.basicjava;

// thread - independent path of execution through program code
// JVM gives each thread it's own method-call stack
public class Threads {

    private Extension extension;

    //runnable

    //thread executor service
    //separates execution from tasks

    //synchronous hashmap

}

class Extension extends Thread{
    public void run ()
    {
        for (int count = 1, row = 1; row < 20; row++, count++)
        {
            for (int i = 0; i < count; i++)
                System.out.print ('*');
            System.out.print ('\n');
        }
    }
}
