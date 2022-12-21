/* Perimeter Of Square */
import java.util.Scanner;
public class Q12 {
    public  static void main(String[] args){
        System.out.println("enter the sides of square : ");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int square = side*side;
        System.out.println(square +" is the perimeter of square.");
    }
}
