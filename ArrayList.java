/*ArrayList :- ArrayLists are dynamic in size. ArrayList is part of java.util package. 
 * Arraylist adjusts its size automatically when an element is added or removed.
 * ArrayList can only store Objects but not Primitive Data types
 * 
 * Syntax: ArrayList<data type> arr = new ArrayList<data type>();
 */

 import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<>();

        players.add(0, "Bryant");  //Syntax to add element to ArrayList
        players.add("Wade"); // adding element without providing index
    }
}
