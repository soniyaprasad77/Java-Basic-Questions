/* Sum Of A Digits Of Number */
import java.util.Scanner;
public class Q24 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = in.nextInt();
        int sum =0;
        int rem=0;
        for(int i=0; num>0; i++){
            rem = num%10;
            sum += rem;
            num = num/10;

        }
        System.out.println("The sum of digits of given number is : " + sum);

    }
}
