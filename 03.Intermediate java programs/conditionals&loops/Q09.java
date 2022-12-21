/* Perimeter Of Equilateral Triangle */
import java.util.Scanner;
public class Q09 {
    public static void main(String[] args){
        System.out.println("enter the radius of equilateral triangle : ");
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        Double perimeter = 3*radius;
        System.out.println(perimeter + " is the perimeter of given equilateral triangle ");

    }

}
