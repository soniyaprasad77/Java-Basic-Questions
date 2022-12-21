/*To calculate Fibonacci Series up to n numbers. */
import java.util.Scanner;
public class Q07 {
    //iterative version of fibonacci series
    public static void main(String[] args) {
        System.out.println("enter the number until which you want to calculate fibonacci : ");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int fib, fibm1;
        int fib1 =0;
        int fib2 =1;
        for(int i=2; i<=n; i++){
            fib = fib1+fib2;
            System.out.println("fibonacci at index " + i + " is " + fib);
            fib1=fib2;
            fib2=fib;
        }
    }
}