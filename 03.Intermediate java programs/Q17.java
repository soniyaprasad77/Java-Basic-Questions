/* Find if a number is palindrome or not */
import java.util.*;
public class Q17 {
    public static void main(String[] args){
        System.out.println("enter a number : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = n;
        int revnum = 0;
        int rem;
        for(int i=0; num!=0; i++){
            rem = num%10;
            revnum = revnum*10 + rem ;
            num = num/10;
        }
        System.out.println("reverse of given number is " + revnum);
        if(n==revnum){
            System.out.println("The given " + n + " number is palindrome.");
        }
        else{
            System.out.println("The given " + n + " number is not a palindrome.");
        }

    }
}
