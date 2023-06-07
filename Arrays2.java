import java.util.*;

/*Joining 2 arrays.
 * Syntax: System.arraycopy(arr1,arr1_start_position,arr2,arr2_start_position, no_of_elements)
 * arr1: source arr
 * arr2: Destination arr
 * no_of_elements: No of elements to be copied.
 */

class ArrConcatenation {
    public static void main(String[] args){
        int[] arr1 = {1,4,2,5,6};
        int[] arr2 = {6,7,3,9};
        int[] concatedArr = new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, concatedArr, 0, arr1.length);
        System.out.println(Arrays.toString(concatedArr));
        System.arraycopy(arr2,0,concatedArr,arr1.length,arr2.length);
        System.out.println(Arrays.toString(concatedArr));
    }
}
