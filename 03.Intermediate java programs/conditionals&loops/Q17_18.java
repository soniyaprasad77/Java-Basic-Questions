/* Volume Of Sphere
Volume Of Pyramid */
import java.util.Scanner;
public class Q17_18 {
    public static void main(String[] args){
        System.out.println("enter the radius of the sphere : ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double volume =(4*3.14 * r * r * r)/3; // volume of sphere = ( 4*3.14*r^3 )/3
        System.out.println(volume + " is the volume of the sphere ");
        System.out.println("enter the base length, base width and pyramid height ; ");
        double l = sc.nextDouble();
        double w =sc.nextDouble();
        double h = sc.nextDouble();
        double v = (l*w*h)/3; //where l = base length , w = base width , h = pyramid height
        System.out.println( v + " is the volume of the given pyramid. ");
    }
}
