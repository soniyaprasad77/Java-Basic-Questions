/*Area Of Triangle*/

import java.util.Scanner;
public class Q02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base and height of the triangle : ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area = 0.5*base*height;
        System.out.println("Area of the given triangle is : " + area);
    }
}
