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
class Main4{
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

class Main5{
    public static void main(String[] args){
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
        input.close();
}
}

/*Program to reverse an array of strings that are taken from user */
class Main6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N+1];
        for(int i=0;i<=N;i++){
            String a = sc.nextLine();     //Storing inputs in an array
            arr[i] = a;
        }
        for(int i=arr.length-1;i>=0;i-=1){    //Printing elements in reverse order using for loop
            System.out.println(arr[i]);
        }
        sc.close();
    }
}

/*Program to find a transpose of a matrix for MxN Matrix */
class TransposeMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr1 = new int[M][N];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){           //Interchanging M and N so that rows and columns interchange.
            for(int j=0;j<M;j++){
                System.out.print(arr1[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}