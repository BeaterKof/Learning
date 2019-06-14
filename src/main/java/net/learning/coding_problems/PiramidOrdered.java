package net.learning.coding_problems;

import java.util.Arrays;

/**
 * @author Andrei Aioanei
 * @created 13.06.2019
 */
public class PiramidOrdered {

    public static void main(String[] args) {

        int[] stonesArray = {1, 1, 3, 3, 2, 1};

        int maxPileIndex = getMaxPileIdxForLowestCost(stonesArray);

        int[] result = getPiramid(10,4, 3);

        printArray(result);

    }

    static int getMaxPileIdxForLowestCost(int[] stonesArray) {
        // get initial max idx
        int initialMaxIdx = 0;
        for(int i=1; i<stonesArray.length; i++) {
            if(stonesArray[i] > stonesArray[initialMaxIdx]) {
                initialMaxIdx = i;
            }
        }

        // check piles next to max
        // todo

        int i = initialMaxIdx;
        int j = initialMaxIdx;

        int tilesProcessed = 1;
        int cost = 0;
        int maxValue = stonesArray[initialMaxIdx];

        while(stonesArray[i] > 0) {

            //check minimum of next piles

            //drop max pile and next pile to next smallest pile + 1 (increase cost and tiles processed by 2)
            // increase cost will be (tilesProcessed * eachDrop)



            i--;
            j++;
        }




        return 0;
    }

    static int[] getPiramid(int arraySize, int maxPileIndex, int maxPileSize) {
        int[] stonesArray = new int[arraySize];
        Arrays.fill(stonesArray, 0);
        stonesArray[maxPileIndex] = maxPileSize;
        int i= maxPileIndex-1;
        int j= maxPileIndex+1;
        int val = maxPileSize - 1;

        while(val > 0) {
            stonesArray[i] = val;
            stonesArray[j] = val;
            val--;
            i--;
            j++;
        }

        return stonesArray;
    }

    static void printArray(int[] array) {
        for(int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
