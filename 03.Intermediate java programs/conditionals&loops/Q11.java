/* Perimeter Of Rectangle */
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args){
        System.out.println("enter the length and breadth of rectangle : ");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int bdt = sc.nextInt();
        int perimeter = 2*(len + bdt);
        System.out.println(perimeter);

    }
}
