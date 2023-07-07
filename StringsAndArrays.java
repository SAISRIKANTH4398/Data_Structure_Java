import java.util.*;

/*Split() method is used to split the string at specified separator and returns an array of substrings. */
class SplittingStrings {
    public static void main(String[] args) {
        String message = "See you soon";
        String[] messageArr = message.split(" "); //Whitespace as a separator
        System.out.println(Arrays.toString(messageArr)); //["See", "you", "soon"]
    }
}

/*
 * Regex or Regular Expression is a sequence of characters that define a pattern that can be used to search for or manipulate strings.
 * metacharacter: dot (.)
   bracket list: []
   position anchors: ^, $
   occurrence indicators: +, *, ?, { }
   parentheses: ()
   or: |
   escape and metacharacter: backslash (\)
 */

 class splitWithRegex{
    public static void main(String[] args) {
        String str = "One1Two22Three333Four";
        String[] stringArr = str.split("[0-9]+"); 
        /*The Regex pattern [.-.] accepts any one of the characters in the range, and 
        the + character means to find one or more occurrences of the given character or a regex pattern. */
        System.out.println(Arrays.toString(stringArr)); //[One, Two, Three, Four].
        
        String message = "See+you+soon";
        String[] messageArr = message.split("+"); //It throws an error because + is used to find one or more occurence 
        /*In order to split, we need to use escape characters i.e., \\ */
        messageArr = message.split("\\+");
        System.out.println(Arrays.toString(messageArr));//["See", "you", "soon"]
        
    }
 }