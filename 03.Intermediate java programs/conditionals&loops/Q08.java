/* Perimeter Of Circle */
import java.util.Scanner;
public class Q08 {
    public static void main(String[] args){
        System.out.println("enter the radius of the of the circle: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double a = 3.14*2*radius;
        System.out.println(a + " is the area of the circle.");
    }
}
