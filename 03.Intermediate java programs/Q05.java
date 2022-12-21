/*Calculate distance between two points.*/
import java.util.Scanner;
import java.lang.Math;
public class Q05 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("enter the co-ordinates(x1,y1) : ");
        int x1 =in.nextInt();
        int y1 =in.nextInt();
        System.out.println("enter the co-ordinates(x2,y2)");
        int x2 =in.nextInt();
        int y2 =in.nextInt();
        double distance=0;
       if(x1>x2 && y1>y2) {
           distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
       }
        else if(x1<x2 && y1<y2) {
            distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        }

        System.out.println( distance + " is the distance between these two points.");
    }
}
