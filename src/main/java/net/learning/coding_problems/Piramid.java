package net.learning.coding_problems;

import java.util.NavigableSet;
import java.util.TreeMap;

/**
 * @author Andrei Aioanei
 * @created 09.06.2019
 */
public class Piramid {

    private TreeMap<Integer, Integer> stonesMap = new TreeMap<>();
    private Integer cost = 0;

    public Piramid(int[] stonesArray) {
        for(int i: stonesArray) {
            int count = stonesMap.getOrDefault(i, 0);
            stonesMap.put(i, count+1);
        }

    }

    public void finalPrintPiramid() {
        TreeMap<Integer, Integer> stonesMapCopy = new TreeMap<>(stonesMap);

        System.out.print("Piramid: [ ");
        for(int i : stonesMapCopy.keySet()) {
            System.out.print(i + " ");
        }

        stonesMapCopy.remove(stonesMapCopy.lastKey());
        NavigableSet<Integer> subSet = stonesMapCopy.descendingKeySet();

        for(int i : subSet) {
            System.out.print(i + " ");
        }
        System.out.print("]\n");
        System.out.println("Cost: " + cost);
    }

    public void printStones() {
        System.out.println("Stones:");
        stonesMap.forEach( (s, nr) -> System.out.println(s + " -> " + nr));
        System.out.println();
    }

    public int solvePiramid() {

        // check last key has only 1 value
        checkLastKey();

        //TODO remove
        printStones();
        System.out.println();

        // check smaller keys have values of 2 descending
        for(int i = stonesMap.lastKey()-1; i > 0; i--) {
            int value = stonesMap.getOrDefault(i, 0);
            if(value > 2) {
                decrementValueTo(i, 2);
            } else if (value == 1) {
                decrementValueTo(i, 0);
                decrementAllHigherValues(i);
            } else if (value == 0){
                decrementAllHigherValues(i);
            }
            //TODO remove
            printStones();
            System.out.println();
        }

        return cost;
    }

    private void decrementAllHigherValues(int key) {
        // get cost
        int newCost = (stonesMap.lastKey() - key) * 2 - 1;
        cost += newCost;

        // if the key is second to last
        if(key == stonesMap.lastKey() - 1) {
            decrementValueTo(key, 0);
            stonesMap.put(key, 1);
            stonesMap.remove(stonesMap.lastKey());
        } else {
            // shift all higher values
            stonesMap.remove(stonesMap.lastKey());
            stonesMap.put(stonesMap.lastKey(), 1);
            stonesMap.put(key, 2);
        }


    }

    private void checkLastKey() {
        int lastKey = stonesMap.lastKey();
        if(stonesMap.get(lastKey) > 1) {
            decrementValueTo(lastKey, 1);
        } else {
            stonesMap.putIfAbsent(lastKey - 1, 0);
        }
    }

    // decrement value for a key and add the difference to the next smaller value
    private void decrementValueTo(Integer key, Integer targetValue) {
        int difference = stonesMap.get(key) - targetValue;
        stonesMap.put(key, targetValue);

        int smallerKeyValue = stonesMap.getOrDefault(key - 1, 0);
        stonesMap.put(key - 1, smallerKeyValue + difference);

        cost += difference;
    }


    public static void main(String[] args) {

//        int[] stonesArray = {1, 1, 3, 3, 2, 1};
        int[] stonesArray = {1, 1, 9};

        Piramid piramid = new Piramid(stonesArray);

        System.out.print("Initial values: \n[ ");
        for(int i : stonesArray) {
            System.out.print(i + " ");
        }
        System.out.println("]\n\n");

        piramid.solvePiramid();

        System.out.println("Final values:");
        piramid.printStones();
        piramid.finalPrintPiramid();

    }
}
