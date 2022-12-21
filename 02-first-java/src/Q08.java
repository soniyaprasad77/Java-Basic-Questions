/* To find out whether the given String is Palindrome or not.
*/
import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Original, reverse ="";
        System.out.println("enter the string : ");
        Original = sc.nextLine();
        int length = Original.length();
        for(int i= length-1; i>=0; i--) {
           reverse=reverse+Original.charAt(i);
        }
        if(Original.equals(reverse)){
            System.out.println("The given string is a palindrome.");
        }
        else{
            System.out.println("The given string is not a palindrome.");
        }
    }
}