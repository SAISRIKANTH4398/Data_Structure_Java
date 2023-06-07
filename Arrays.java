/* In Java, Arrays are objects used to store data of same data type.
 The size of an array is always fixed */

 //datatype[] arrayName  --> Declaring an array

 //Declaration does not create an array but it tells the compiler that an array will hold a particular data type.

 //datatype[] arrayName = {value1, value2,..}  Creating and initializing

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {60, 25, 20, 15, 30};
        // declaring, creating and initializing in a single statement
        System.out.println(Arrays.toString(arr));
    }
}

class Main2 {
    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 2, 5};

        System.out.println(arr[0]); //Accessing elements. Index starts from 0 and goes until length-1
        System.out.println(arr[1]);
        System.out.println(arr[4]);
        System.out.println(Arrays.toString(arr)); // Syntax to print an array
        arr[0] = 53;         //To modify the elements in an array
        System.out.println(Arrays.toString(arr)); 
    }
}

class Main3{
    public static void main(String[] args){
        int[] arr = new int[3];  //By this method, we can create an array of required length and assign values later
        /*In the above code, allocates memory for 3 int values.
         * After creating an array, by default 0 is assigned for byte, short, int or long type of array
         * For double and float, by default it is 0.0
         * For String, it is null
         */
        arr[0]=1;
        arr[1]=2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length); //To find length of an array
    }
}

class Iterating1{
    public static void main(String[] args){
        int[] arr = {1,4,6,7};
        int n = arr.length;
        for(int i=0;i<n;i++){            //Iterating an array using for loop.
            System.out.println(arr[i]);
        }
        for(int i: arr){           //Iterating an array using for-each loop.
            System.out.println(i);  
        }
    }
}