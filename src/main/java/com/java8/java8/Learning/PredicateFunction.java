package com.java8.java8.Learning;

import java.util.function.Predicate;


public class PredicateFunction {

    public static void main(String[] args) {

        Predicate<Integer> hello = x -> x > 1000;

        System.out.println(hello.test(10000));
    }
}
