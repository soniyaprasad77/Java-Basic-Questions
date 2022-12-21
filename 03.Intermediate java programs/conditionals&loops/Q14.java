/* Volume Of Cone Java Program */
import java.util.Scanner;
public class Q14 {
  public static void main(String[] args)  {
      System.out.println("enter the  radius and height of the cone: ");
      Scanner sc = new Scanner(System.in);
      double r = sc.nextDouble();
      double h = sc.nextDouble();
      double volume =( 3.14 * r * r * h )/3;
      System.out.println(volume);
  }
}
