package net.learning.workspace;

import java.time.Instant;
import java.util.*;
import java.util.concurrent.*;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
public class Main {

    public static void main(String[] args) {

        A a = new A();
        a.printme();

    }



    static int factorial(int n) {
        return n <= 2 ? 2 : n * factorial(n - 1);
    }

    static int fibonacci(int n) {
        return n <= 2 ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int sumDigits(int n) {
        return n <= 0 ? 0 : (n % 10) + sumDigits(n / 10);
    }

    static String reverseString(String n) {
        return n.length() <= 1 ? n : reverseString(n.substring(1, n.length())) + n.charAt(0);
    }

    static boolean palindrome(String s) {
        return s.length() <= 1 || s.charAt(0) == s.charAt(s.length()-1) && palindrome(s.substring(1, s.length() - 1));
    }

    static void decToBin(int n) {
        if (n > 0) {
            decToBin(n / 2);
            System.out.print(n % 2);
        }
    }

    static int powerOf(int n, int pow) {
        return pow <= 1 ? n : powerOf(n, pow - 1) * n;
    }

    static <E> List<E> reverseList(List<E> list, int idx) {
        if(idx < list.size()/2) {
            E temp = list.get(idx);
            list.set(idx, list.get(list.size() - (1 + idx)));
            list.set(list.size() - (1 + idx), temp);
//            System.out.println(list);
            return reverseList(list, idx + 1);
        }
        return list;
    }
}

class B {
    static void printme() {
        System.out.println("print B");
    }
}

class A extends B {
    static void printme() {
        System.out.println("print A");
    }
}
