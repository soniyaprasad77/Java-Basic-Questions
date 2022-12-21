/* Total Surface Area Of Cube */
import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        System.out.println("enter the edge length of the cube : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tsa = 6*a*a;
        System.out.println(tsa + " is the total  surface area of the given cube.");
    }
}
