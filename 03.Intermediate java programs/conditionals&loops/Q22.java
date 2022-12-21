/*Subtract the Product and Sum of Digits of an Integer*/
import java.util.Scanner;
public class Q22 {
     public static void main(String[] args){
         System.out.println("enter the integer : ");
         Scanner in = new Scanner(System.in);
         int  a = in.nextInt();
         int sum =0;
         int product =1;
         int diff;
         while(a!=0){
             int rem = a%10;
             sum += rem;
             product *= rem;
             a = a/10;
         }
         if(product>sum) {
              diff = product - sum;
         }
         else{
              diff = sum - product;
         }
         System.out.println( sum + " is the sum of digits of given integer.");
         System.out.println(product + " is the product of digits of the given number.");
         System.out.println(diff + " is the difference between the product and sum. ");

     }
}

