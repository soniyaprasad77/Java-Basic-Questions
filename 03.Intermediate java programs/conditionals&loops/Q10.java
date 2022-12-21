/* Perimeter Of Parallelogram */
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args){
        System.out.println("enter the side of Parallelogram : ");
        Scanner sc = new Scanner(System.in);
        int pgm_side1 = sc.nextInt();
        int pgm_side2 = sc.nextInt();
        int perimeter = 2*(pgm_side1 + pgm_side2);
        System.out.println(perimeter);
    }
}
