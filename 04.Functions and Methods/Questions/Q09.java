/* Write a program to print the factorial of a number by defining a method named 'Factorial'.
 Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
 E.g.-
4! = 1 * 2 * 3 * 4 = 24
3! = 3 * 2 * 1 = 6
2! = 2 * 1 = 2
Also,
1! = 1
0! = 1
*/
import java.util.Scanner;
public class Q09 {
    public static void main(String[] args){
        System.out.println("enter the number: ");
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("The factorial of given number is " + Factorial(num));
    }
    static int Factorial(int n){
        int fact=1;
        if(n==0){
            fact =1;
        }
        else{
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        }
        return fact;
    }
}
