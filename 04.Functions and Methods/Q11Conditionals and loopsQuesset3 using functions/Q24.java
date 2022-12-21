/* Sum Of A Digits Of Number */
import java.util.*;
public class Q24 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = in.nextInt();
        Sum_Of_Digits(num);
    }
    static void  Sum_Of_Digits(int num){
        int sum=0;
        for(int i=0;num>0; i++){
            int rem = num%10;
            sum += rem;
            num=num/10;
        }
        System.out.println(sum + " is the sum of digits of given number.");
    }
}
