/* Reverse A String In Java */
import java.util.*;
import java.lang.String;
public class Q16 {
    public static void main(String[] args) {
        System.out.println("enter the String : ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(string_reverse(name));
    }

    static String string_reverse(String name) {
        String reverse = "";
        for (int i = 0; i < name.length(); i++){

            reverse = name.charAt(i) + reverse;
    }
    return reverse;
 }
}
