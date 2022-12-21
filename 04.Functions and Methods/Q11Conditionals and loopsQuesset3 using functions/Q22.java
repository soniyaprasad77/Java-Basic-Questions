/* Perfect Number In Java */
import java.util.*;
public class Q22 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = in.nextInt();
        Check_perfect_num(num);

    }
    static void Check_perfect_num(int num){
        int n = num;
        int sum=0;
        for(int i =1; i<=n/2; i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        if(sum==num){
            System.out.println(num + " is a perfect number.");
        }
        else{
            System.out.println(num + " is not a perfect number.");
        }
    }
}
