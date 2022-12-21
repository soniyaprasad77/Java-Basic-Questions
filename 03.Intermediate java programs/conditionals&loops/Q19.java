/* Curved Surface Area Of Cylinder */

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        System.out.println("enter the radius and height of the cylinder : ");
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        double h = sc.nextDouble();
        double curved_area =2*3.14 * r *  h;
        System.out.println(curved_area + " is the curved surface area of the given cylinder. ");
    }
}
