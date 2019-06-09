package net.learning.workspace;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Stream;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
public class Main {

    public static void main(String[] args) {

        //selection
        int[] arr = {4,5,6,3,22,1,66};
        printarr(arr);
        selection(arr);
        printarr(arr);

    }

    static void selection(int[] arr) {
        if(arr == null) throw new NullPointerException();
        for(int i=0; i<arr.length; i++) {
            swap(arr, findMin(arr, i), i);
        }
    }

    static int findMin(int[] arr, int i) {
        int min=i;
        for(int j=i; j<arr.length; j++) {
            if(arr[j] < arr[i]) min = j;
        }
        return min;
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void printarr(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
