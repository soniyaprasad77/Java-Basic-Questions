/* Write a program to print the circumference and
area of a circle of radius entered by user by defining your own method.
 */
import java.util.*;
public class Q06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius of the circle: ");
        double radius = in.nextDouble();
        circle(radius);
    }
    static void circle(double r){
        double area = 2* 3.14 * r * r;
        double circumference = 2 * 3.14 * r ;
        System.out.println("Area of given circle is " + area);
        System.out.println("Circumference of given circle is " + circumference);
    }
}
