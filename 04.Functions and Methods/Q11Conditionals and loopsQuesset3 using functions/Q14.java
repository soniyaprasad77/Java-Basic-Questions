/* Armstrong Number In Java */
import java.util.*;
public class Q14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        Check_armstrong(num);
    }
    static void Check_armstrong(int num){
        int number=num;
        int n=num;
        int count =0;
        while(n>0){
            count++;
            n=n/10;
        }
        double sum=0;
        //System.out.println(count);
        for(int i = 0; i<count; i++){
            int rem=number%10;
            sum= (sum+ Math.pow(rem,count));
            number=number/10;
        }
        if(num==sum){
            System.out.println("it is armstrong number.");
        }
        else{
            System.out.println("it is not a armstrong number.");
        }
    }
}
