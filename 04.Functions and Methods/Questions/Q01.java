/* Define two methods to print the maximum and the minimum number
respectively among three numbers entered by the user.
 */
import java.util.Scanner;
public class Q01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int n1 = in.nextInt();
        System.out.println("enter the second number: ");
        int n2 = in.nextInt();
        System.out.println("enter the third number: ");
        int n3 = in.nextInt();
        System.out.println( "The maximum of given numbers is " + Max(n1, n2, n3));
        System.out.println( "The minimum of the given numbers is " + Min(n1,n2,n3));
    }
    static int Max(int a, int b, int c){
        int max=a;
        if(max<b){
           max = b;
        }
        if(max<c){
            max =c;
        }
        return max;
    }
    static int Min(int x, int y, int z){
        int min = x;
        if(min>y){
            min = y;
        }
        if(min>z){
            min = z;
        }
        return min;
    }
}
