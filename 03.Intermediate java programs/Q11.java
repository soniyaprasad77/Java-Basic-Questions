/* Compound interest JAVA program */
import java.util.Scanner;
import java.lang.Math;
public class Q11 {
    public static void main(String ags[]){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the principal amount: ");
        double principal = in.nextDouble();
        System.out.println("enter the rate of the amount: ");
        double rate = in.nextDouble();
        System.out.println("enter the Time : ");
        double time = in.nextDouble();
        double compound_interest = principal * (Math.pow((1 + rate/100), time)) - principal ;
       System.out.println(" compound interest is : " + compound_interest);

    }
}
