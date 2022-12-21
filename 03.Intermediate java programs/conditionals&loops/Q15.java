/* Volume Of Prism */
import java.util.Scanner;
public class Q15 {
     public static void main(String[] args){
          System.out.println("enter the base area and height of the prism : ");
          Scanner sc = new Scanner(System.in);
          double b_area= sc.nextDouble();
          double h = sc.nextDouble();
          double volume = b_area * h;
          System.out.println(volume + " is the volume of the given prism. ");
     }
}
