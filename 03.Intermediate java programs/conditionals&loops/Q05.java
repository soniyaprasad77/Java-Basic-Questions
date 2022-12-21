/* Area Of Parallelogram */
import java.util.Scanner;
public class Q05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base and height of the parallelogram : ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double area = base*height;
        System.out.println("Area of the given ||gm is : " + area);
    }
}
