/* Area Of Circle Java Program*/
import java.util.Scanner;
public class Q01 {
    public static void main(String[] args){
       Scanner in= new Scanner(System.in) ;
       System.out.println("enter any number : ");
       float radius = in.nextFloat();
       double area = (3.14*radius*radius);
       System.out.println("area of given circle is : " + area);

    }
}
