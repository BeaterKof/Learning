package net.learning.algorithms;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
public class Recursion {

    public static void main(String[] args){
        System.out.println(factorial(5)==120);
        System.out.println(fibonacci(9)==34);
        System.out.println(sumDigits(1233)==9);
        System.out.println(reverseString("Andrei").equals("ierdnA"));
        System.out.println(palindrome("asdsa"));
        decToBin(10);
        System.out.println();
        System.out.println(powerOf(2, 5)==32);

        Integer a[] = {1,2,3,4,5,6};
        List<Integer> list = Arrays.asList(a);
        reverseList(list,0);

    }

    public static int factorial(int n){
        return (n <= 1) ?  1 : (n * factorial(n - 1));
    }

    public static int fibonacci(int n){
        return (n <= 2) ? n : (fibonacci(n-1) + fibonacci(n-2));
    }

    public static int sumDigits(int n){
        return n<10 ? n%10 : sumDigits(n/10) + n%10;
    }

    public static String reverseString(String s){
        return (s.length() < 2) ? s : reverseString(s.substring(1)) + s.charAt(0);
    }

    public static boolean palindrome(String s){
        return (s.length() <= 1) ? true : (s.charAt(0) == s.charAt(s.length()-1)) && palindrome(s.substring(1,s.length()-2));
    }

    /*
     *  Extra
     */
    public static String reverseStringIndex(AbstractMap.SimpleEntry<Integer, String> entry) {
        return (entry.getKey() == entry.getValue().length()-1) ? entry.getValue().charAt(entry.getKey()) +"" : reverseStringIndex(new AbstractMap.SimpleEntry<Integer, String>(entry.getKey()+1, entry.getValue())) + entry.getValue().charAt(entry.getKey());
    }

    public static void decToBin(int n) {
        if(n>0) {
            decToBin(n/2);
            System.out.print(n%2);
        }
    }

    public static int powerOf(int n, int power) {
        return power<=0 ? 1 : powerOf(n, power-1) * n;
    }

    //delete linked list
    public static void deleteList(List<Integer> list) {
        if(list.size() > 0) {
            list.remove(0);
            deleteList(list);
        }
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

    // TODO: recursive binary search
    // greatest common divisor
    // find all permutations of characters
    //http://www.topjavatutorial.com/java/java-programs/top-programming-interview-questions-using-recursion-in-java/
}
