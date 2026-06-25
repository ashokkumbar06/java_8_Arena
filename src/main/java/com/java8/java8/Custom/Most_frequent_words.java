package com.java8.java8.Custom;

import java.util.*;
import java.util.stream.Collectors;

public class Most_frequent_words {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("apple", "banana",
                "apple", "orange", "banana", "apple", "mango", "banana", "mango", "mango", "mango", "mango");
        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        List<String> ans = map.entrySet().stream()
                .sorted((a, b) ->
                        {
                            int s = b.getValue().compareTo(a.getValue());
                            return s;
                        }
                ).limit(3).map(Map.Entry::getKey).toList();
        TreeSet<String> tree = new TreeSet<>(ans);
        System.out.println(tree);
        System.out.println(firstNonRepeatingChar("swiss"));
    }

    public static Character firstNonRepeatingChar(String str) {
        Map<Character, Integer> freq = new LinkedHashMap<>();

        // Count frequencies
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeating
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // no non-repeating character
    }
}
