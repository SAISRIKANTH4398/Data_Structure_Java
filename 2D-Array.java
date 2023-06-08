import java.util.*;
/*
 * {
 * {1,2,3},
 * {3,4,5},
 * {6,7,8}
 * }
 * This is an example of 2D array with 3 rows and 3 columns so total 9 elements.
 * Declaration:- datatype[][] arrName
 */
class Main{
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr[1][2]);
        System.out.println(Arrays.deepToString(arr)); //To print multi-dimensional array
        int[][] arr2 = new int[3][3]; //Creating array with new keyboard
        arr2[0][0] = 12;
        arr2[0][1] = 4;    //To assign values
        System.out.println(Arrays.deepToString(arr2));
        int rows = arr2.length;   //It counts the number of inner arrays
        int coulmn = arr[0].length;  //It counts the num of elements in an inner array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coulmn; j++) {
                System.out.println("arr[" + i +"][" + j + "]: " + arr[i][j]); //To access each and every element in an array
           }
       }
    }
}

class Main2{
    Scanner input = new Scanner(System.in);

        int rows = input.nextInt();  // reads the number of rows.
        int cols = input.nextInt();  // reads the number of columns.

        int[][] arr = new int[rows][cols];   // creating a two-dimensional arrray

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = input.nextInt();   // reading and storing user inputs in array
           }
       }

        System.out.println(Arrays.deepToString(arr));
}