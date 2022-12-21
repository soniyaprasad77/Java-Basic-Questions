/* Java Program Vowel Or Consonant */
import java.util.*;
public class Q21 {
    public static void main(String[] args){
        System.out.println("enter the character : ");
        Scanner in = new Scanner(System.in);
        char ch= ((in.next()).charAt(0));
        if(ch == 'a' || ch== 'e' || ch=='i' || ch =='o' || ch=='u' ){
            System.out.println(ch + " is vowel");
        }
        else{
            System.out.println(ch + " is consonent");
        }
    }
}
