package com.java8.java8.Function;

import java.util.List;
import java.util.function.Function;

public class functionSet {

    public static void main(String[] args) {

        Function<String,Integer> function1 = x -> x.length();

        System.out.println(function1.apply("ashok"));

        Function<String,String> function2 = s -> s.substring(0,3);

        System.out.println(function2.apply("ashok"));

        //Function<List<String>,List<String>> function2 = list.










    }










    private static class student{

        public int id;
        public String name;

        public student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
