/* Java Program Vowel Or Consonant */
import java.util.*;
public class Q21 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the character:");
        char ch = in.next().charAt(0);
        Check_vowel_consonant(ch);
    }
    static void Check_vowel_consonant(char c){
        if(c =='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println( c + " is a vowel");
        }
        else if(c =='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            System.out.println(c + " is a vowel.");
        }
        else {
            System.out.println("It is consonant.");
        }
    }
}
