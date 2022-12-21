/* Find if a number is palindrome or not*/
import java.util.*;
public class Q17 {
    public static void main(String[] args){
        System.out.println("enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Palindrome(n);
    }
    static void Palindrome(int n){
        int num=n;
        int reverse = 0;
        for(int i=0;num!=0; i++){
            int rem= num%10;
            reverse=reverse*10 +rem;
            num=num/10;
        }
        if(reverse==n){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}
