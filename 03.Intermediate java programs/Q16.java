/* Reverse a STRING in Java */
import java.util.Scanner;
import java.lang.String;
public class Q16 {
    public static void main(String[] args){
        System.out.println("enter a string : ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String nstr = "";
        char ch;
        System.out.println("You have entered : " + str);
        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            nstr =  ch + nstr;
        }
        System.out.println("Reversed string is : " + nstr);
    }
}
