/* Armstrong number in java */
import java.util.Scanner;
import java.lang.Math;
public class Q14 {
    public static void main(String[] args){
        System.out.println("enter the number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int n=number;
        int num = number;
        int count = 0;
        int rem =0;
        while(num!=0){
            num = num/10;
            count++;
        }
        double a_num = 0;
        System.out.println("The no of digits in the above number : " + count);
        /* 153 is armstrong number  : (1)^3 + (5)^3 + (3)^3 = 1 + 125 + 27 =153; */
        for(int i = 0 ; i< count; i++ ){
            rem = n % 10;
            a_num = a_num + Math.pow(rem,count);
            n = n/10;
        }
        if(number== a_num){
            System.out.println("The given number is a armstrong number.");
        }
        else{
            System.out.println("The given number is not a armstrong number.");
        }
    }

}
