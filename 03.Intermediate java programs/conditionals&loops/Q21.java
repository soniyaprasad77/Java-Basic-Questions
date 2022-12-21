/* Fibonacci Series In Java Programs */
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args){
        long fib1 = 0;
        long fib2 = 1;
        long  fib;
        System.out.println("enter the terms upto which you want to calculate the fibonacci: ");
        Scanner sc = new Scanner(System.in);
        long  n = sc.nextInt();
        for(int i = 0 ; i<n ; i++){
            fib = fib1 + fib2;
            System.out.print( fib + " ");
            fib1 =fib2;
            fib2 = fib;
        }
    }
}
