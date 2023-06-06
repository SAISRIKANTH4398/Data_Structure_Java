/* In Java, Arrays are objects used to store data of same data type.
 The size of an array is always fixed */

 //datatype[] arrayName  --> Declaring an array

 //Declaration does not create an array but it tells the compiler that an array will hold a particular data type.

 //datatype[] arrayName = {value1, value2,..}  Creating and initializing
 class Main {
    public static void main(String[] args) {
        int[] arr = {60, 25, 20, 15, 30};
        // declaring, creating and initializing in a single statement
    }
}

class Main2 {
    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 2, 5};

        System.out.println(arr[0]); //Accessing elements. Index starts from 0 and goes until length-1
        System.out.println(arr[1]);
        System.out.println(arr[4]);
    }
}