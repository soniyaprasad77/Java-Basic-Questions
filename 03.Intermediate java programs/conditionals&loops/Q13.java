/* Perimeter Of Rhombus */
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args){
        System.out.println("enter the diagonal of rhombus :");
        Scanner in = new Scanner(System.in);
        int side = in.nextInt();
        int perimeter = 4 * side ;
        System.out.println(perimeter + " is the perimeter of rhombus ");
    }
}
