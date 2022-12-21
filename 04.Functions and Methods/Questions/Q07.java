/* Define a method to find out if a number is prime or not. */
import java.util.*;
public class Q07 {
    public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        prime(num);
    }

    static void prime(int n) {
        int flag = 0;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime");
        } else {

            for (int i = 2; i < Math.sqrt(n); i++) {

                if (n % i == 0) {
                    System.out.println(n + " is not prime");
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                System.out.println("is prime");
            }
        }
    }
}