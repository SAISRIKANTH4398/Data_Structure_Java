/*
 * {
 * {1,2,3},
 * {3,4,5},
 * {6,7,8}
 * }
 * This is an example of 2D array with 3 rows and 3 columns so total 9 elements.
 * Declaration:- datatype[][] arrName
 */

import java.util.Arrays;

class Main{
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr[1][2]);
        System.out.println(Arrays.deepToString(arr)); //To print multi-dimensional array
        int[][] arr2 = new int[3][3]; //Creating array with new keyboard
        arr2[0][0] = 12;
        arr2[0][1] = 4;
        System.out.println(Arrays.deepToString(arr2));
    }
}