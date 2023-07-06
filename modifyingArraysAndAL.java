import java.util.*;

class modifyingArraysAndAL1 {
    /*In this case, both arr1 and arr2  are referring to one array, so if any changes, both the arrays get impacted. */
    public static void main(String[] args) {
        int[] arr1 = {34, 45, 19, 21};
        int[] arr2 = arr1;   //arr2 is assigned with arr1.
        arr2[1] = 100;   //If arr2 modifies or arr1 modifies, both the arrays get changed.
        arr1[3] = 76;
        System.out.println(Arrays.toString(arr1)); //[34, 100, 19,76]
        System.out.println(Arrays.toString(arr2)); //[34, 100, 19, 76]

        //Same as the case with Arraylists 
        ArrayList<Integer> arrList1  = new ArrayList<>();
        arrList1.add(34);
        arrList1.add(45);
        arrList1.add(19);
        arrList1.add(21);
        ArrayList<Integer> arrList2 = arrList1; // arrList2 is referring arrList1
        arrList2.set(1, 100);
        arrList2.set(3, 76);
        System.out.println(arrList1);  //[34, 100, 19,76]
        System.out.println(arrList2);  //[34, 100, 19,76]
    }
}

class modifyingArraysAndAL2 {
    /*In this case, arr3 is referring to an array and arr2 is referring to a new array */
    public static void main(String[] args) {
        int[] arr3 = {34, 45, 19, 21};
        int[] arr4 = arr3;
        arr4 = new int[4];
        System.out.println(Arrays.toString(arr3)); //[34, 45, 19, 21]
        System.out.println(Arrays.toString(arr4)); //[0, 0, 0, 0]

        ArrayList<Integer> arrList1  = new ArrayList<>();
        arrList1.add(34);
        arrList1.add(45);
        arrList1.add(19);
        arrList1.add(21);
        ArrayList<Integer> arrList2 = arrList1; 
        arrList2 = new ArrayList<>();  //Though arrList2 is referring to arrList1, arrList2 is referring to new AL
        System.out.println(arrList1);  //[34, 45, 19, 21]
        System.out.println(arrList2);  //[]
    }
}

/*Updating immutable objects do not affect the values in an array. */

class modifyingArraysAndAL3{
    public static void main(String[] args) {
        String name = "John";
        String[] namesArr = {name, "Smith", "Mike"};
        System.out.println(Arrays.toString(namesArr));  //[John, Smith, Mike]
        name = "John Martin";
        System.out.println(Arrays.toString(namesArr));  //[John, Smith, Mike]
        //Even the variable name has changed, it does n't impact the namesArr
    }
}