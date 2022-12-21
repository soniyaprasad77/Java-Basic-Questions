/* Calculate Commission Percentage */

import java.util.Scanner;
public class Q06 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the percentage: ");
        double percent = in.nextDouble();
        System.out.println("enter your salary: ");
        double price = in.nextDouble();
        System.out.println(Commision(percent, price));
    }
    static double Commision(double per, double pri){
        double commision = (pri * per)/100;
        return commision;
    }
}
