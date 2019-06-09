package net.learning.interview;

/**
 * created by: andrei
 * date: 19.11.2018
 **/
public class DoubleArrayDiagSearch {

    public static void main(String[] args) {
        int[][] matrix = createMatrix(4);
        printMatrix(matrix);
        System.out.println();
        System.out.println(searchDiag(matrix, 15));
    }

    static int[][] createMatrix(int size) {
        int[][] arr = new int[size][size];
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                arr[i][j] = j+i*size;
            }
        }
        return arr;
    }

    static void printMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean searchDiag(int[][] matrix, int val) {
        for(int i=0; i<matrix.length; i++) {
            if(matrix[i][i]==val)
                return true;
        }
        return false;
    }
}
