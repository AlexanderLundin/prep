package com.prep.hackerrank.sort;

import java.util.*;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student s) {
        if (cgpa > s.cgpa){
            // receiving object is greater than specified object
            return -1;
        }
        else if(fname.compareTo(s.fname) < 0){
            return -1;
        }else if (s.id < id){
            return -1;
        }
        return 1;
    }
}

//Complete the code
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("waiting on input");
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList);
        Collections.sort(studentList);
        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}