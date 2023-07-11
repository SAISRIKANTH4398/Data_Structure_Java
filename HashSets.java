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

        System.out.println(players.size()); //returns the length of a hashset.

    }
}

class hsetOps{
    /*Union Operator:- addAll() method performs the union of two sets. */
    public static void main(String[] args) {
        HashSet<Integer> hset1 = new HashSet<>();
        HashSet<Integer> hset2 = new HashSet<>();
        hset1.add(3);
        hset1.add(32);
        hset1.add(8);
        hset2.add(8);
        hset2.add(32);
        hset2.add(30);
        System.out.println("hset1: " + hset1);
        System.out.println("hset2: " + hset2);
        hset1.addAll(hset2); // union of hset1 and hset2
        // hset1.retainAll(hset2); //Intersection of hset1 and hset2
        //hset1.removeAll(hset2); //To find difference between 2 hashsets.
        System.out.println("\nhset1 after Union:  " + hset1);
    }
}
