import java.util.*;

/*indexOf() -> this method is used to get the index of first occurence of specific element in the arrayList.
 * if the element is not present, it returns -1
 * The element should be given as an object, not as primitive data type.
 */
class findIndex {
        public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(3);
        arrList.add(6);
        arrList.add(2);
        arrList.add(1);
        System.out.println(arrList);
        int index = arrList.indexOf((Integer)6); // finding index of 6.
        System.out.println(index);
    }
}
