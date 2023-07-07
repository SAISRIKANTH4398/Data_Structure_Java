import java.util.*;

/*Split() method is used to split the string at specified separator and returns an array of substrings. */
class SplittingStrings {
    public static void main(String[] args) {
        String message = "See you soon";
        String[] messageArr = message.split(" "); //Whitespace as a separator
        System.out.println(Arrays.toString(messageArr)); //["See", "you", "soon"]
    }
}
