/* Define a program to find out whether a given number is even or odd. */
import java.util.*;
public class Q02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your number.");
        int num = in.nextInt();
        even_odd(num);
        }
        static void even_odd(int n){
        if(n%2==0){
            System.out.println("It is even. ");
        }
        else{
            System.out.println("It is odd. ");
        }
        }
    }
