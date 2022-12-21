/* Write a program to print the sum of two numbers entered by user by defining your own method. */
import java.util.Scanner;
public class Q04 {
    public static void main(String[] args){
        System.out.println("enter the first number: ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        System.out.println("enter the second number: ");
        int n2 = in.nextInt();
        System.out.println(sum(n1,n2));
    }
    static int sum(int a, int b){
        int Sum = a + b ;
        return Sum;
    }
}
