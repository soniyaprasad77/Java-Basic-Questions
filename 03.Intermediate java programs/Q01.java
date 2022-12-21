/* Factorial Program in java */
import java.math.BigInteger;
import java.util.Scanner;
public class Q01 {
    public static void main(String[] args) {
        System.out.println("enter the number : ");
        Scanner in = new Scanner(System.in);
        long num = in.nextInt();
        long fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact *i;
        }
        System.out.println("The factorial of given number is : " + fact);

    }
}
