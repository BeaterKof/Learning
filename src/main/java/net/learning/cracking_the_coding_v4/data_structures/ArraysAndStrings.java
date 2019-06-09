package net.learning.cracking_the_coding_v4.data_structures;

import java.util.HashSet;
import java.util.Set;

/*
    1. String has unique caracters. Without using additional data structures.
    2. Code to reverse C-Style strings (contain null at their end)
    3. Remove duplicates without using additional structure.
 */
public class ArraysAndStrings {

    public static void main(String[] args) {
        String s = "abccddaa";
        System.out.println(removeDuplicates(s.toCharArray()));
    }

    static boolean hasAllUniqueCaracters(String s) {
        Set<Character> set = new HashSet<>(32);
        for(char c : s.toCharArray()) {
            if(set.contains(c))
                return false;
            else
                set.add(c);
        }
        return true;
    }

    static boolean hasAllUniqueCaractersBest(String s) {
        boolean[] char_set = new boolean[256];
        for(int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if(char_set[val] == true) return false;
            else char_set[val] = true;
        }
        return true;
    }

    static char[] removeDuplicates(char[] arr) {
        int tail=1;
        for(int i=0; i<arr.length; i++) {
            int j = 0;
            for(; j<tail; j++) {
                if(arr[i]==arr[j]) break;
            }
            if(tail == j) {
                arr[tail] = arr[i];
                tail++;
            }
        }
        arr[tail] = 0;
        return arr;
    }

}

