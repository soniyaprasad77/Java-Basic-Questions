/*Area Of Equilateral Triangle*/
import java.util.Scanner;
public class Q07 {
    public static void main(String[] args){
        System.out.println("enter the side of the equilateral triangle : ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double area =( 1.73 * a * a)/4;
        System.out.println(area);
    }
}
