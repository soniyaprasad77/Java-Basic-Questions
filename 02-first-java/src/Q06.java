/* Input currency in rupees and output in USD. */

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args){
        System.out.println("enter the currency in rupees : ");
        Scanner sc = new Scanner(System.in);
        double rup = sc.nextFloat();
        double USD =(rup * 0.012);
        System.out.println(USD);
    }
}
