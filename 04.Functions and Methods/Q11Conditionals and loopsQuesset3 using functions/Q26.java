/* Write a program to print the sum of negative numbers, sum of positive even numbers and
 the sum of positive odd numbers from a list of numbers (N) entered by the user.
 The list terminates when the user enters a zero.
 */
import java.util.*;
public class Q26 {
    public static void main(String[] args)
    {
        sum();
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        int sum_E=0;
        int sum_O=0;
        int sum_N=0;
        while(true){
            System.out.println("enter the number : ");
            int num = in.nextInt();
            if(num<0){
                sum_N +=num;
            }
            else if(num%2==0){
                sum_E +=num;
            }
            else if(num%2!=0){
                sum_O += num;
            }
            if (num==0){
                break;
            }
        }
        System.out.println(sum_N + " is the sum of all the negative numbers");
        System.out.println(sum_E + " is the sum of all the positive even numbers");
        System.out.println(sum_O + " is the sum of all the positive odd numbers");
    }
}
