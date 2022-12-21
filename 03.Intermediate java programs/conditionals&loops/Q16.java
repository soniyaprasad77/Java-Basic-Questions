/* volume of Cylinder */
import java.util.Scanner;
public class Q16 {
    public static void main(String[] args){
        System.out.println("enter the radius and height of the cylinder : ");
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        double h = sc.nextDouble();
        double volume =3.14 * r * r * h;
        System.out.println(volume + " is the volume of the given cylinder. ");
    }


}
