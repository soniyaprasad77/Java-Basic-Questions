/*Area Of Rectangle Program*/
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length and breadth of the rectangle : ");
        int len = sc.nextInt();
        int brd = sc.nextInt();
        int area = len*brd;
        System.out.println(" The area of given rectangle is : " + area);
    }
}
