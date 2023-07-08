/*Hashsets are unordered collection of elements. It allows unique values, repeated values are not allowed.
 * HashSets are from java.util package.
 * They store only objects like String, Integer..
 * 
 * Syntax:-  HashSet<Type> var = new HashSet<>();
 */

import java.util.HashSet;

class Main14 {
    public static void main(String[] args) {
        HashSet<String> players = new HashSet<>();
        players.add("Rohit");
        boolean isAdded = players.add("Virat");
        players.add("Dhoni");  //To add an element to a HashSet.
        System.out.println(players);   //To print a Hashset
        System.out.println(isAdded);
        isAdded = players.add("Virat");
        System.out.println(isAdded);

        //Syntax to remove an element. If element exists in Hashset, it returns true, else false
        System.out.println(players.remove("Rohit"));  
        System.out.println(players.remove("Sachin"));
        System.out.println(players);

        //players.clear() method removes all the elements in a HashSet.
        boolean isPresent = players.contains("Dhoni"); //if element is  present in hashset or not. returns true or false.
        System.out.println(isPresent);

    }
}