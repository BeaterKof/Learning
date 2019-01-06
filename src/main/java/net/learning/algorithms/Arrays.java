package net.learning.algorithms;

import java.util.Random;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
public class Arrays {

    //why use array instead of objectual Array?
    /* Array
       -can contain primitives
       -multidimensional
       -faster

       ArrayList
       -resizable
       -takes longer to resize
       -add and get are aprox the same speed as Array
     */

    private int array[];

    public Arrays(){
        array  = new int[5];
    }

    public void setRandArray(){
        Random generator = new Random();
        for(int i=0; i < array.length; i++){
            array[0] = generator.nextInt();
        }
    }

    public void printArray(){
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int getIndexVal(int index){
        if(index < array.length){
            return array[index];
        } else {
            return 0;
        }
    }

    public boolean contains(int n){
        for(int i : array){
            if(n == array[i]){
                return true;
            }
        }
        return false;
    }

    public void deleteAllValues(int n){
        int j = 0;
        for(int i=0; i < array.length; i++){
            if(array[i] != n){
                array[j++] = array[i];
            }
        }
        int newArray[] = new int[j];
        System.arraycopy(array, 0, newArray, 0, j);
    }

    //
//Searches can be linear or binary.
//Linear search is searching one by one, from the begining of the array.
//Binary is faster but the array must be sorted at first.
//
}
