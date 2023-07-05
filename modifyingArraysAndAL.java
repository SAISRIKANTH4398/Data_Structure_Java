import java.util.*;

class modifyingArraysAndAL1 {
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
