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
        System.out.println(players.get(1));  // To access an element.
        System.out.println(players); //To print an ArrayList
        players.set(1, "Dhoni");  //To update an ArrayLists
        System.out.println(players);
    }
}

/*As ArrayLists accept only Objects. To add Primitive Data types, we have Wrapper classes in Java
 * _____________________________________
 * Primitive       |     Wrapper       |
 * -------------------------------------
 * boolean         |     Boolean       |
 * byte            |     Byte          |
   char	           |     Character     |
   double          |     Double        |
   float           |     Float         |
   int             |     Integer       |
   long	           |     Long          |
   short           |     Short         |
 */
class AddPrimitiveToArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> points = new ArrayList<>();

        points.add(56);
        points.add(75);
        points.add(84);

        System.out.println(points);
    }
}