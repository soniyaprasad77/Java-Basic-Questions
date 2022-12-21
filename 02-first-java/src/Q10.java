/* Write a java program to find the maximum of three numbers */
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the three numbers : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c= in.nextInt();
//        int max;
//        max=a;
//        if(b>max) {
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
        if(a>b && a>c){
            System.out.println(a + " is the greatest number .");
        }
       else if( b>c && b>a){
            System.out.println(b + " is the greatest number .");
        }
       else {
            System.out.println(c + " is the greatest number .");
        }
    }

}
