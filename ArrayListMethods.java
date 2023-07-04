import java.util.*;

/*indexOf() -> this method is used to get the index of first occurence of specific element in the arrayList.
 * if the element is not present, it returns -1
 * The element should be given as an object, not as primitive data type.
 * 
 * Collections.frequency() -> this method is used to find the frequency with which an element occurs in an arraylist.
 * Syntax: Collections.frequency(arr, obj)
 * 
 */
class arrayListMethods {
        public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(3);
        arrList.add(6);
        arrList.add(2);
        arrList.add(1);
        arrList.add(2);
        System.out.println(arrList);
        int index = arrList.indexOf((Integer)6); // finding index of 6.
        int frequency = Collections.frequency(arrList, (Integer)2); //finding frequency of 2
        System.out.println(frequency);
        System.out.println(index);
    }
}
