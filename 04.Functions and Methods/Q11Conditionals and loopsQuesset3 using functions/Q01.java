/* Factorial Program In Java */

import java.util.*;
public class Q01{
    public static void main(String[] args){
        System.out.println("enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factorial(num));

    }
    static int factorial(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
