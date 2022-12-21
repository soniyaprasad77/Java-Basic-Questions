/* Power in Java */
import java.util.Scanner;
public class Q07 {
    public static void main(String args[]){
        System.out.println("enter the number : ");
        Scanner in = new Scanner(System.in);
        double num = in.nextDouble();
        System.out.println("power");
        double  result =1;
        int pow = in.nextInt();
        for(int i=1; i<=pow; i++) {
            result = result * num;
        }
        System.out.println("The powered value of " + num + " is " + result);
    }
}
