package net.learning.algorithms;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
public class Searching {

    /*
     * It is mandatory for the array to be sorted.
     * We compare the searched value with the value from the middle of the array.
     * Then, we repeat this step.
     */

    public void binarySearch(int[] myArray, int value){
        int lowIndex = 0;
        int highIndex = myArray.length -1;
        boolean found = false;
        while(lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex) / 2;

            if(value > myArray[middleIndex]){
                lowIndex = middleIndex;
            }
            else if(value < myArray[middleIndex]) {
                highIndex = middleIndex - 1;
            }
            else {
                System.out.println("Value " + value + " found at: " + middleIndex );
                found = true;
                lowIndex = highIndex + 1;
            }
        }
        if(found == false){
            System.out.println("Value not found.");
        }
    }

    /*
     * Interpolar search
     * Is a improved binary search. After the first step, te next position is sorted by a new formula:
     * mid = Lo + ((Hi - Lo) / (A[Hi] - A[Lo])) * (X - A[Lo])
     */

   /*
       Hashing

       Hashing is a technique to convert a range of key values into a range of indexes of an array.

    */
}
