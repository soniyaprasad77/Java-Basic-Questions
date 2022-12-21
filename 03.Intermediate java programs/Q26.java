/* Write a program to print the sum of negative numbers, sum of positive even numbers and
 the sum of positive odd numbers from a list of numbers (N) entered by the user.
 The list terminates when the user enters a zero. */
import java.util.Scanner;
public class Q26 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N_sum =0;
        int E_sum =0;
        int O_sum =0;
        while(true){
            System.out.println("enter the num : ");
            int num = in.nextInt();
            if(num<0){
                N_sum += num;
            }
            if(num>0 && num%2==0){
                E_sum += num;
            }
            if(num>0 && num%2!=0){
                O_sum += num;
            }
            if(num==0)
                break;
        }
        System.out.println("the sum of negative numbers: " + N_sum);
        System.out.println("the sum of positive even numbers: " + E_sum);
        System.out.println("the sum of positive odd numbers: " + O_sum);
    }
}
