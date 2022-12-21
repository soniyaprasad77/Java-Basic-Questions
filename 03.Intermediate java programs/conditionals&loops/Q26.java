/* Addition of two numbers */
import java.util.Scanner;
public class Q26 {
    public static void main(String[] args) {
        System.out.println("enter the first number : ");

        Scanner in = new Scanner(System.in);
        long n1 = in.nextInt();
        System.out.println("enter the second number : ");
        long n2 = in.nextInt();
        long sum ;
        sum = n1 + n2;
        System.out.println("The sum of above numbers is : " + sum);

    }
}
