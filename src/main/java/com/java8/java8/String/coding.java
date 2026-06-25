package com.java8.java8.String;

public class coding {

    public static void main(String[] args) {

        String f = "abcdcaf";
        String s = f.toLowerCase();


        for (int i = 0; i <= s.length(); i++) {
            char a = s.charAt(i);
            if (s.indexOf(a) == s.lastIndexOf(a)) {
               // System.out.printf(i);
            }
            System.out.printf("-1");
        }


    }
}
