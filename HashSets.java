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
    }
}