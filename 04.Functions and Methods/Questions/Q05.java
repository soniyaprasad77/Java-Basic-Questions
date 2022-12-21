/* Define a method that returns the product of two numbers entered by user. */
import java.util.Scanner;
public class Q05 {
    public static void main(String[] args){
        System.out.println("enter the first number: ");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        System.out.println("enter the second number: ");
        int n2 = in.nextInt();
        System.out.println(product(n1,n2));
    }
    static int product(int a, int b){
       int  product = a * b;
       return product;
    }
}
