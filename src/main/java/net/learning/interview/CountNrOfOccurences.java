package net.learning.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNrOfOccurences {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ana are mere ana are prune ana".split(" "));
        System.out.println(countOccurences(list));

    }

    static Map<String, Integer> countOccurences(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : list ) {
            if(map.containsKey(s))
                map.put(s,map.get(s) + 1);
            else
                map.put(s,1);
        }
        return map;
    }
}
